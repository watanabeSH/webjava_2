package utility;

import java.util.Scanner;

public class ScannerUtil {

  private static ScannerUtil instance = new ScannerUtil();

  private PrintUtil printer = new PrintUtil();
  private Scanner scanner = new Scanner(System.in);
  private boolean isClosed = false;

  public static ScannerUtil getInstance() {
    return instance;
  }

  public String getInputSelect(String[] validater) {
    String input;
    boolean isOk = false;

    if (isClosed) {
      return null;
    };

    do {
      printer.inputPrefix();
      input = scanner.next();

      if (validater != null) {
        for (int i = 0; i < validater.length; i++) {
          if (input.equals(validater[i])) {
            isOk = true;
          }
        }
      } else {
        isOk = true;
      }

      if (!isOk) {
        printer.alart("不正な入力値です！入力し直してください。");
        printer.print("　入力例：( ");
        for (int i = 0; i < validater.length; i++) {
          printer.print(validater[i] + " ");
        }
        printer.print(")");
      }

      printer.spaceln(1);
    } while (!isOk);

    return input;

  }

  public String getInputText() {
    String input;
    String inputSelect;
    boolean isOk = false;

    if (isClosed) {
      return null;
    };

    do {
      printer.inputPrefix();
      input = scanner.next();

      printer.info("「" + input + "」でよろしいですか？（y/n）");
      inputSelect = getInputSelect(new String[] {"y", "n"});
      if (inputSelect.equals("y")) {
        isOk = true;
        printer.spaceln(1);
      }

    } while (!isOk);

    return input;
  }

  public void close() {
    scanner.close();
    isClosed = true;
  }
}