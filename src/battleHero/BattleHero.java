package battleHero;

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
    do {
      stage = sf.create();
    } while(stage.go(player));

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
