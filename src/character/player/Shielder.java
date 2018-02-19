package character.player;

import java.util.Random;

public class Shielder extends PlayerBase {

  public Shielder() {
    Random rnd = new Random();
    setJob("シールダー");
    setHitPoint(400 + rnd.nextInt(50));
    setAttack(10 + rnd.nextInt(10));
    setDefense(50 + rnd.nextInt(10));
    setMagicAttack(10 + rnd.nextInt(10));
    setMagicDefense(50 + rnd.nextInt(10));
  }
}
