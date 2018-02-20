package character.player;

public class Shielder extends PlayerBase {

  public Shielder() {
    setJob("シールダー");
    setHitPoint(400 + rnd.nextInt(50));
    setAttack(10 + rnd.nextInt(10));
    setDefense(50 + rnd.nextInt(10));
    setMagicAttack(10 + rnd.nextInt(10));
    setMagicDefense(50 + rnd.nextInt(10));
  }
}
