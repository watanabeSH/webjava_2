package character.enemy;

import java.util.Random;
import character.CharacterBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public class Slate extends EnemyBase{

  PrintUtil printer = new PrintUtil();
  Random rnd = new Random();

  public Slate() {
    setName("謎の石板");
    setHitPoint(10 + rnd.nextInt(50));
    setAttack(0 + rnd.nextInt(15));
    setDefense(2000 + rnd.nextInt(15));
    setMagicAttack(50+ rnd.nextInt(15));
    setMagicDefense(20 + rnd.nextInt(15));
  }

  @Override
  public void reward(PlayerBase chara) {
    printer.battle(chara.getName() + "のステータスが上がった！");
    chara.setAttack(chara.getAttack() + 2);
    chara.setDefense(chara.getDefense() + 5);
    chara.setMagicAttack(chara.getMagicAttack() + 2);
    chara.setMagicDefense(chara.getMagicDefense() + 2);

    int money = 200;
    printer.battle("[" + money + "] ゼニーを手に入れた！");
    chara.setMoney(chara.getMoney() + money);

  }

  @Override
  public void action(CharacterBase chara) {

    int num = rnd.nextInt(10);
    if( num <= 8 ) {
      printer.battle(getName() + "から光が放たれた！");
      chara.damage(getMagicAttack() - chara.getMagicDefense());
    } else {
      printer.battle(getName() + "静かに佇んでいる。");
    }

  }
}
