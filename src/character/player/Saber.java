package character.player;

public class Saber extends PlayerBase {

  public Saber() {
    setJob("セイバー");
    setHitPoint(300 + rnd.nextInt(50));
    setAttack(40 + rnd.nextInt(10));
    setDefense(40 + rnd.nextInt(10));
    setMagicAttack(20 + rnd.nextInt(10));
    setMagicDefense(20 + rnd.nextInt(10));
  }

}