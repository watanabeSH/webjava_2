package character;

import java.util.Random;

public class Saber extends PlayerBase {

  public Saber() {
    Random rnd = new Random();
    setJob("剣士");
    setHitPoint(100 + rnd.nextInt(20));
    setAttack(20 + rnd.nextInt(20));
    setDefense(20 + rnd.nextInt(20));
    setMagicAttack(20 + rnd.nextInt(20));
    setMagicDefense(20 + rnd.nextInt(20));
  }

}