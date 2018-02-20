package character.enemy;

import character.CharacterBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public abstract class EnemyBase extends CharacterBase {

  PrintUtil printer = new PrintUtil();

  public abstract void reward(PlayerBase character);

  @Override
  public void action(CharacterBase chara) {
    printer.battle(getName() + "の攻撃！");
    chara.damage(getAttack() - chara.getDefense());
  }
}
