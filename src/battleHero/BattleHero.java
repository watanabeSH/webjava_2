package battleHero;

import character.enemy.EnemyBase;
import character.player.Attacker;
import character.player.PlayerBase;
import character.player.Saber;
import character.player.Shielder;
import character.player.Wizard;
import stage.GrassField;
import stage.Mountain;
import stage.StageBase;
import utility.PrintUtil;
import utility.ScannerUtil;

public class BattleHero {

  final static PrintUtil printer = new PrintUtil();
  final static ScannerUtil scanner = new ScannerUtil();

  public static void main(String[] args) {

    printer.info("Battle Heroにようこそ！");

    // プレイヤー作成

    PlayerBase player = null;

    printer.info("まずはキャラクターを作成しましょう！");
    printer.spaceln(1);
    printer.info("まずはキャラクターの職業を選択してください！");
    printer.spaceln(1);
    printer.select(new String[]
        {"セイバー",
         "ウィザード",
         "アタッカー",
         "シールダー"
        });
    String jobInput = scanner.getInputSelect(new String[] {"1","2","3","4"});

    if (jobInput.equals("1")) {
      player = new Saber();
    } else if (jobInput.equals("2")) {
      player = new Wizard();
    } else if (jobInput.equals("3")) {
      player = new Attacker();
    } else if (jobInput.equals("4")) {
      player = new Shielder();
    }

    printer.info("次にキャラクター名を入力してください。");
    player.setName(scanner.getInputText());

    printer.info("キャラクターを作成しました！");
    player.displayStatus();
    printer.spaceln(2);


    // ステージ選択
    StageBase stage = null;
    EnemyBase enemy = null;

    do {
      printer.info("冒険に出かけましょう！");
      printer.info("どこに向かう？（下に行くほど難易度は上がります）");
      printer.spaceln(1);
      printer.select(new String[]
          {"草原",
           "森",
           "山",
           "洞窟"
          });
      String stageInput = scanner.getInputSelect(new String[] {"1","2","3","4"});
      printer.spaceln(1);
      if (stageInput.equals("1")) {
        stage = new GrassField();
      } else if (stageInput.equals("2")) {
        stage = new Mountain();
      } else if (stageInput.equals("3")) {
        stage = new Mountain();
      } else if (stageInput.equals("4")) {
        stage = new Mountain();
      }

      printer.info(player.getName() +"は" + stage.getName() + "に向かった。");
      printer.spaceln(1);
      enemy = stage.encountEnemy();

    } while(battle(player,enemy));

    gameOver(player);

  }

  private static boolean battle(PlayerBase player, EnemyBase enemy) {

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

  private static void gameOver(PlayerBase player) {
    printer.alart("残念...");
    printer.alart("あなたはモンスターによって倒されてしまいました。");
    printer.spaceln(2);
    printer.alart("------------ GAMEOVER ------------");
    printer.spaceln(2);
    printer.alart("------------ 最終結果 ------------");
    printer.spaceln(1);
    player.displayStatus();
  }

}
