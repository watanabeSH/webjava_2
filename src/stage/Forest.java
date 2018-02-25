package stage;

import character.enemy.BonusSlime;
import character.enemy.Dragon;
import character.enemy.Goblin;
import character.enemy.Skelton;
import character.enemy.Slime;

public class Forest extends StageBase {

  public Forest () {
    setName("森");
    addEnemy(new Slime(),6);
    addEnemy(new Goblin(),10);
    addEnemy(new Skelton(),10);
    addEnemy(new BonusSlime(),1);
    addEnemy(new Dragon(),1);
  }
}
