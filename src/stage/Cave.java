package stage;

import character.enemy.BonusSlime;
import character.enemy.Dragon;

public class Cave extends StageBase {

  public Cave () {
    setName("洞窟");
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new BonusSlime());
    addEnemy(new BonusSlime());
  }
}
