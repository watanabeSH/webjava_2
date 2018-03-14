package battleHero;

import character.enemy.EnemyBase;
import character.player.PlayerBase;
import factory.PlayerFactory;
import factory.StageFactory;
import stage.StageBase;
import utility.PrintUtil;
import utility.ScannerUtil;

public class BattleHero {

  final static PrintUtil printer = new PrintUtil();
  final static ScannerUtil scanner = ScannerUtil.getInstance();

  public void gameStart() {

    BattleHero battleHero = new BattleHero();

    printer.info("Battle Heroにようこそ！");

    // プレイヤー作成
    PlayerFactory pf = new PlayerFactory();
    PlayerBase player = pf.create();

    // ステージ選択
    StageFactory sf = new StageFactory();
    StageBase stage = null;
    EnemyBase enemy = null;

    do {
      printer.info("冒険に出かけましょう！");
      printer.info("どこに向かう？（下に行くほど難易度は上がります）");
      printer.spaceln(1);

      stage = sf.create();

      printer.info(player.getName() +"は" + stage.getName() + "に向かった。");
      printer.spaceln(1);
      enemy = stage.encountEnemy();

    } while(stage.battle(player,enemy));

    battleHero.gameOver(player);

  }

  private  void gameOver(PlayerBase player) {
    printer.alart("残念...");
    printer.alart("あなたはモンスターによって倒されてしまいました。");
    printer.spaceln(2);
    printer.alart("------------ GAMEOVER ------------");
    printer.spaceln(2);
    printer.alart("------------ 最終結果 ------------");
    printer.spaceln(1);
    player.displayStatus();
    scanner.close();
  }

}
