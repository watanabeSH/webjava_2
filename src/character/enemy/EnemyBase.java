package character.enemy;

import character.CharacterBase;
import character.player.PlayerBase;

public abstract class EnemyBase extends CharacterBase {

  public abstract void reward(PlayerBase character);

}
