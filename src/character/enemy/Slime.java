package character.enemy;

import java.util.Random;
import character.CharacterBase;
import character.player.PlayerBase;
import utility.PrintUtil;

public class Slime extends EnemyBase{

  PrintUtil printer = new PrintUtil();

  public Slime() {
    Random rnd = new Random();
    setName("スライム");
    setHitPoint(38 + rnd.nextInt(5));
    setAttack(40 + rnd.nextInt(5));
    setDefense(5 + rnd.nextInt(5));
    setMagicAttack(30 + rnd.nextInt(5));
    setMagicDefense(5 + rnd.nextInt(5));
  }

  @Override
  public void reward(PlayerBase chara) {
    printer.battle(chara.getName() + "のステータスが上がった！");
    chara.setAttack(chara.getAttack() + 1);
    chara.setDefense(chara.getDefense() + 1);
    chara.setMagicAttack(chara.getMagicAttack() + 1);
    chara.setMagicDefense(chara.getMagicDefense() + 1);

    int money = 20;
    printer.battle("[" + money + "] ゼニーを手に入れた！");
    chara.setMoney(chara.getMoney() + money);

  }

  @Override
  public void action(CharacterBase chara) {
    printer.battle(getName() + "の攻撃！");
    chara.damage(getAttack() - chara.getDefense());
  }
}
