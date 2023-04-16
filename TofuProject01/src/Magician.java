public class Magician extends Character{

    private int power;
    private int magicPoint;
    public Magician(String name){
        super(name);
        super.setJob("Magician");
        this.power = 100;
        this.magicPoint = 200;
    }
}
