package character.player;

import java.util.Random;

public class Attacker extends PlayerBase {

  public Attacker() {
    Random rnd = new Random();
    setJob("アタッカー");
    setHitPoint(300 + rnd.nextInt(50));
    setAttack(50 + rnd.nextInt(10));
    setDefense(15 + rnd.nextInt(10));
    setMagicAttack(50 + rnd.nextInt(10));
    setMagicDefense(15 + rnd.nextInt(10));
  }
}
