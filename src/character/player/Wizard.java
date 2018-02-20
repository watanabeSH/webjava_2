package character.player;

public class Wizard extends PlayerBase {

  public Wizard() {
    setJob("ウィザード");
    setHitPoint(300 + rnd.nextInt(50));
    setAttack(20 + rnd.nextInt(10));
    setDefense(20 + rnd.nextInt(10));
    setMagicAttack(40 + rnd.nextInt(10));
    setMagicDefense(40 + rnd.nextInt(10));
  }

}