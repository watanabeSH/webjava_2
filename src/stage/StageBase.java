package stage;
import java.util.ArrayList;
import java.util.Random;
import character.enemy.EnemyBase;
import utility.PrintUtil;

public abstract class StageBase {
  private String name;
  private ArrayList<EnemyBase> enemys = new ArrayList<EnemyBase>();
  PrintUtil printer = new PrintUtil();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addEnemy(EnemyBase enemy) {
    enemys.add(enemy);
  }

  public EnemyBase encountEnemy() {
    Random rnd = new Random();
    EnemyBase enemy = enemys.get(rnd.nextInt(enemys.size() -1));
    printer.battle(enemy.getName()  + "に遭遇した！");
    return enemy;
  }

}
