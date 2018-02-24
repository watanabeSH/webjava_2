package factory;

import character.player.Attacker;
import character.player.PlayerBase;
import character.player.Saber;
import character.player.Shielder;
import character.player.Wizard;
import utility.PrintUtil;
import utility.ScannerUtil;

public class PlayerFactory {

  final static PrintUtil printer = new PrintUtil();
  final static ScannerUtil scanner = ScannerUtil.getInstance();

  public PlayerBase create() {

    PlayerBase player = null;

    printer.info("まずはキャラクターを作成しましょう！");
    printer.spaceln(1);
    printer.info("まずはキャラクターの職業を選択してください！");
    printer.spaceln(1);
    printer.select(new String[] {"セイバー", "ウィザード", "アタッカー", "シールダー"});
    String jobInput = scanner.getInputSelect(new String[] {"1", "2", "3", "4"});

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

    return player;
  }
}
