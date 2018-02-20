package character.enemy;

import character.CharacterBase;
import character.player.PlayerBase;

public abstract class EnemyBase extends CharacterBase {

  public abstract void reward(PlayerBase character);

  @Override
  public void action(CharacterBase chara) {
    printer.battle(getName() + "の攻撃！");
    chara.damage(getAttack() - chara.getDefense());
  }
}
