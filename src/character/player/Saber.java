package character.player;

import java.util.Random;

public class Saber extends PlayerBase {

  public Saber() {
    Random rnd = new Random();
    setJob("セイバー");
    setHitPoint(300 + rnd.nextInt(50));
    setAttack(40 + rnd.nextInt(10));
    setDefense(40 + rnd.nextInt(10));
    setMagicAttack(20 + rnd.nextInt(10));
    setMagicDefense(20 + rnd.nextInt(10));
  }

}