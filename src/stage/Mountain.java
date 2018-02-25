package stage;

import character.enemy.BonusSlime;
import character.enemy.Dragon;
import character.enemy.Goblin;
import character.enemy.Skelton;
import character.enemy.Slate;

public class Mountain extends StageBase {

  public Mountain () {
    setName("山");
    addEnemy(new Goblin(), 6);
    addEnemy(new Slate(),6);
    addEnemy(new Skelton(),9);
    addEnemy(new BonusSlime(),1);
    addEnemy(new Dragon(),1);
  }
}
