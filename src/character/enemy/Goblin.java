package character.enemy;

import character.CharacterBase;
import character.player.PlayerBase;

public class Goblin extends EnemyBase{

  public Goblin() {
    setName("ゴブリン");
    setHitPoint(70 + rnd.nextInt(50));
    setAttack(45 + rnd.nextInt(15));
    setDefense(20 + rnd.nextInt(15));
    setMagicAttack(0+ rnd.nextInt(15));
    setMagicDefense(10 + rnd.nextInt(15));
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
      printer.battle(getName() + "はニヤけている。");
    }

  }
}
