package stage;
import java.util.ArrayList;
import character.Character;
import character.enemy.EnemyBase;

public abstract class StageBase {
  private ArrayList<EnemyBase> enemys = new ArrayList<EnemyBase>();

  public void addEnemy(EnemyBase enemy) {
    enemys.add(enemy);
  }

  public abstract void buttle(Character char1, Character char2);

  public abstract void start(Character character);
}
