package character;

import java.util.Random;
import utility.PrintUtil;
import utility.ScannerUtil;

public abstract class CharacterBase {
  private String name;
  private int hitPoint;
  private int attack;
  private int defense;
  private int magicAttack;
  private int magicDefense;
  protected PrintUtil printer = new PrintUtil();
  protected ScannerUtil scanner = ScannerUtil.getInstance();
  protected Random rnd = new Random();

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHitPoint() {
    return hitPoint;
  }
  public void setHitPoint(int hitPoint) {
    this.hitPoint = hitPoint;
  }
  public int getAttack() {
    return attack;
  }
  public void setAttack(int attack) {
    this.attack = attack;
  }
  public int getDefense() {
    return defense;
  }
  public void setDefense(int defense) {
    this.defense = defense;
  }
  public int getMagicAttack() {
    return magicAttack;
  }
  public void setMagicAttack(int magicAttack) {
    this.magicAttack = magicAttack;
  }
  public int getMagicDefense() {
    return magicDefense;
  }
  public void setMagicDefense(int magicDefense) {
    this.magicDefense = magicDefense;
  }

  public void damage(int damage) {

    if ( damage < 0 ) {
      damage = 0;
    }

    this.hitPoint = this.hitPoint - damage;
    this.printer.battle( name + "は、[" + damage + "] ダメージを受けた！");

    if ( this.hitPoint < 0 ) {
      this.hitPoint = 0;
    }
  }

  public void heal (int heal) {
    this.hitPoint = this.hitPoint + heal;
    this.printer.battle( name + "は、[" + heal + "] 回復した！");
  }

  public abstract void action(CharacterBase chara);

}
