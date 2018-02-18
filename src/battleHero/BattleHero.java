package battleHero;

import character.PlayerBase;
import character.Saber;
import utility.PrintUtil;
import utility.ScannerUtil;

public class BattleHero {

  static PrintUtil printer = new PrintUtil();

  public static void main(String[] args) {

    ScannerUtil scanner = new ScannerUtil();

    printer.info("Battle Heroにようこそ！");

    // プレイヤー作成
    PlayerBase player = null;

    printer.info("まずはキャラクターを作成しましょう！");
    printer.spaceln(1);
    printer.info("まずはキャラクターの職業を選択してください！");
    printer.spaceln(1);
    printer.select(new String[] {"剣士","魔術師",""});
    String jobInput = scanner.getInputSelect(new String[] {"1"});

    if (jobInput.equals("1")) {
      player = new Saber();
    }

    printer.info("次にキャラクター名を入力してください。");
    player.setName(scanner.getInputText());

    printer.info("キャラクターを作成しました！");
    player.displayStatus();








  }


}
