package character.enemy;

import character.CharacterBase;
import character.player.PlayerBase;

public class BonusSlime extends EnemyBase{

  public BonusSlime() {
    setName("ボーナススライム");
    setHitPoint(1);
    setAttack(0);
    setDefense(9999);
    setMagicAttack(0);
    setMagicDefense(9999);
  }

  @Override
  public void reward(PlayerBase chara) {
    printer.battle(chara.getName() + "のステータスが上がった！");
    chara.setAttack(chara.getAttack() + 30);
    chara.setDefense(chara.getDefense() + 30);
    chara.setMagicAttack(chara.getMagicAttack() + 30);
    chara.setMagicDefense(chara.getMagicDefense() + 30);

    int money = 5000;
    printer.battle("[" + money + "] ゼニーを手に入れた！");
    chara.setMoney(chara.getMoney() + money);

  }

  @Override
  public void action(CharacterBase chara) {
    printer.battle(getName() + "「君は運がいいね！バイバイ！」");
    setHitPoint(0);
  }
}
