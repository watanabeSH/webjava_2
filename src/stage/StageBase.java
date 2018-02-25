package stage;
import java.util.ArrayList;
import java.util.Random;
import character.enemy.EnemyBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public abstract class StageBase {
  private String name;
  private ArrayList<EnemyBase> enemys = new ArrayList<EnemyBase>();
  private PrintUtil printer = new PrintUtil();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addEnemy(EnemyBase enemy, int num) {
  for (int i = 0 ; i<= num ; i++) {
    enemys.add(enemy);
  }
  }

  public EnemyBase encountEnemy() {
    Random rnd = new Random();
    EnemyBase enemy = enemys.get(rnd.nextInt(enemys.size()));
    printer.battle(enemy.getName()  + "に遭遇した！");
    return enemy;
  }

  public boolean battle(PlayerBase player, EnemyBase enemy) {

    do {
      player.action(enemy);

      if (enemy.getHitPoint() == 0 ) {
        printer.info(enemy.getName() + "をたおした！");
        enemy.reward(player);
        player.displayStatus();
        return true;
      } else if (player.getHitPoint() == 0 ) {
        return false;
      }

      printer.spaceln(1);
      enemy.action(player);

      if (enemy.getHitPoint() == 0 ) {
        printer.info(enemy.getName() + "をたおした！");
        enemy.reward(player);
        player.displayStatus();
        return true;
      } else if (player.getHitPoint() == 0 ) {
        return false;
      }

     printer.battle("現在の" + player.getName() + "の体力" + player.getHitPoint());
     printer.spaceln(1);


    } while(true);
  }

}
