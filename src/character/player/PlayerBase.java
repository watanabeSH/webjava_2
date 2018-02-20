package character.player;

import character.CharacterBase;

public abstract class PlayerBase extends CharacterBase {
  private String job;
  private int money = 0;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void displayStatus() {

    printer.println("〇--------------------------〇");
    printer.status("名前:" + getName());
    printer.status("職業:" + getJob());
    printer.status("体力:" + getHitPoint());
    printer.status("攻撃:" + getAttack());
    printer.status("防御:" + getDefense());
    printer.status("魔力:" + getMagicAttack());
    printer.status("精神:" + getMagicDefense());
    printer.status("所持金:" + getMoney());
    printer.println("〇--------------------------〇");
  }


  @Override
  public void action(CharacterBase chara) {

    printer.battle(getName() + "のターンです。");

    printer.select(new String[]
        {"攻撃",
         "魔法",
         "回復"
        });
    String actInput = scanner.getInputSelect(new String[] {"1","2","3"});

    if (actInput.equals("1")) {
      if (rnd.nextInt(10) <= 8) {
        printer.battle(getName() + "の攻撃！");
        chara.damage(getAttack() - chara.getDefense());
      } else {
        printer.battle(getName() + "の渾身の攻撃！");
        chara.damage(getAttack() * 2 - chara.getDefense());
      }

    } else if (actInput.equals("2")) {
      if (rnd.nextInt(10) <= 8) {
        printer.battle(getName() + "は魔法を放った！");
        chara.damage(getMagicAttack() - chara.getMagicDefense());
      } else {
        printer.battle(getName() + "は全力の魔法を放った！");
        chara.damage(getMagicAttack() * 2 - chara.getMagicDefense());
      }

    } else if (actInput.equals("3")) {
      printer.battle(getName() + "は体力を回復した！");
      if (rnd.nextInt(10) <= 7) {
        this.heal(50);
      } else {
        printer.battle("しかし、うまく決まらなかった！");
      }
    }
  }

}
