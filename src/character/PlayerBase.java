package character;

import utility.PrintUtil;

public abstract class PlayerBase extends Character {
  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public void displayStatus() {
    PrintUtil printer = new PrintUtil();
    printer.println("〇----------------------------〇");
    printer.status("名前:" + getName());
    printer.status("職業:" + getJob());
    printer.status("体力:" + getHitPoint());
    printer.status("攻撃:" + getAttack());
    printer.status("防御:" + getDefense());
    printer.status("魔力:" + getMagicAttack());
    printer.status("精神:" + getMagicDefense());
    printer.println("〇----------------------------〇");
  }
}
