package character.enemy;

import java.util.Random;
import character.CharacterBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public class Skeleton extends EnemyBase{

  PrintUtil printer = new PrintUtil();
  Random rnd = new Random();

  public Skeleton() {
    setName("スケルトン");
    setHitPoint(60 + rnd.nextInt(50));
    setAttack(40 + rnd.nextInt(15));
    setDefense(20 + rnd.nextInt(15));
    setMagicAttack(50+ rnd.nextInt(15));
    setMagicDefense(20 + rnd.nextInt(15));
  }

  @Override
  public void reward(PlayerBase chara) {
    printer.battle(chara.getName() + "のステータスが上がった！");
    chara.setAttack(chara.getAttack() + 3);
    chara.setDefense(chara.getDefense() + 3);
    chara.setMagicAttack(chara.getMagicAttack() + 3);
    chara.setMagicDefense(chara.getMagicDefense() + 3);

    int money = 100;
    printer.battle("[" + money + "] ゼニーを手に入れた！");
    chara.setMoney(chara.getMoney() + money);

  }

  @Override
  public void action(CharacterBase chara) {

    int num = rnd.nextInt(10);
    if( num <= 8 ) {
      printer.battle(getName() + "の攻撃！");
      chara.damage(getAttack() - chara.getDefense());
    } else {
      printer.battle(getName() + "の攻撃！");
      chara.damage(getAttack() - chara.getDefense());
    }

  }
}
