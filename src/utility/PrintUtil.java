package utility;
public class PrintUtil {

  public void print(String text) {
    System.out.print(text);
  }

  public void println(String text) {
    System.out.println(text);
  }

  /**
   * お知らせ出力メソッド
   */
  public void info(String text) {
    System.out.println("◆ " + text + " ...");
  }

  /**
   * 選択肢出力メソッド
   */
  public void select(String[] text) {
    System.out.println("------------------------------");

    for (int i = 0 ; i < text.length ; i++) {
      System.out.println(" [" + (i + 1)  + "]  " + text[i]);
    }

    System.out.println("------------------------------");
  }

  public void status(String text) {
    System.out.println("  ◇" + text);
  }


  public void inputPrefix() {
    System.out.print("入力：");
  }

  /**
   * アラート出力メソッド
   */
  public void alart(String text) {
    System.out.println("※ " + text + " ...");
  }

  /**
   * 指定した数値分ラインスペースを空ける
   */
  public void spaceln(int lineCount) {
    for (int i = 1 ; i <= lineCount ; i++) {
      System.out.println("");
    }
  }
}
