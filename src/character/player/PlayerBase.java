package character.player;

import character.CharacterBase;
import utility.PrintUtil;

public abstract class PlayerBase extends CharacterBase {
  private String job;
   private int money = 0;
  PrintUtil printer = new PrintUtil();

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
    printer.battle(getName() + "の攻撃！");
    chara.damage(getAttack() - chara.getDefense());
  }

}
