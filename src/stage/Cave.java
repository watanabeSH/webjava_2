package stage;

import character.enemy.BonusSlime;
import character.enemy.Dragon;

public class Cave extends StageBase {

  public Cave () {
    setName("洞窟");
    addEnemy(new Dragon(),5);
    addEnemy(new BonusSlime(),1);
  }
}
