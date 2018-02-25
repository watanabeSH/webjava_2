package stage;

import character.enemy.Goblin;
import character.enemy.Slime;

public class GrassField extends StageBase {

  public GrassField () {
    setName("草原");
    addEnemy(new Slime(),3);
    addEnemy(new Goblin(),2);
  }
}
