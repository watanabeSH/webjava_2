package character.enemy;

import java.util.Random;
import character.CharacterBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public class Dragon extends EnemyBase{

  PrintUtil printer = new PrintUtil();

  public Dragon() {
    Random rnd = new Random();
    setName("ドラゴン");
    setHitPoint(500 + rnd.nextInt(50));
    setAttack(100 + rnd.nextInt(15));
    setDefense(40 + rnd.nextInt(15));
    setMagicAttack(40+ rnd.nextInt(15));
    setMagicDefense(40 + rnd.nextInt(15));
  }

  @Override
  public void reward(PlayerBase chara) {
    printer.battle(chara.getName() + "のステータスが上がった！");
    chara.setAttack(chara.getAttack() + 10);
    chara.setDefense(chara.getDefense() + 10);
    chara.setMagicAttack(chara.getMagicAttack() + 10);
    chara.setMagicDefense(chara.getMagicDefense() + 10);

    int money = 1000;
    printer.battle("[" + money + "] ゼニーを手に入れた！");
    chara.setMoney(chara.getMoney() + money);

  }

  @Override
  public void action(CharacterBase chara) {
    printer.battle(getName() + "の攻撃！");
    chara.damage(getAttack() - chara.getDefense());
  }
}
