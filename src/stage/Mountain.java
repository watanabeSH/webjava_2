package stage;

import character.enemy.Dragon;
import character.enemy.Slime;

public class Mountain extends StageBase {

  public Mountain () {
    setName("山");
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Slime());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
  }
}
