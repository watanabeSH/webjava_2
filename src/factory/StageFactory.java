package factory;

import stage.GrassField;
import stage.Mountain;
import stage.StageBase;
import utility.PrintUtil;
import utility.ScannerUtil;

public class StageFactory {

  final static PrintUtil printer = new PrintUtil();
  final static ScannerUtil scanner = ScannerUtil.getInstance();

  public StageBase create( ) {
    printer.info("冒険に出かけましょう！");
    printer.info("どこに向かう？（下に行くほど難易度は上がります）");
    printer.spaceln(1);
    StageBase stage = null;
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
    return stage;
  }
}
