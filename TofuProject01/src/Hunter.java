public class Hunter extends Character{

    private int power;
    private int magicPoint;
  public Hunter(String name){
      super(name);
      super.setJob("Hunter");
      this.power = 200;
      this.magicPoint = 100;
  }


}
