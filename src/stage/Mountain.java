package stage;

import character.enemy.BonusSlime;
import character.enemy.Dragon;
import character.enemy.Goblin;
import character.enemy.Skelton;
import character.enemy.Slate;

public class Mountain extends StageBase {

  public Mountain () {
    setName("山");
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Goblin());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Slate());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new Skelton());
    addEnemy(new BonusSlime());
    addEnemy(new BonusSlime());
    addEnemy(new Dragon());
    addEnemy(new Dragon());
  }
}
