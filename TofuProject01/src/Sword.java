public class Sword extends WeaponMaster implements Weapon{
    private int k;
    public Sword(String name, int levelLimited, String jobLimited){

        super(name, levelLimited, jobLimited);
        k = 0;
    }

    @Override
    public void develope() {
        setAbility();
    }

}
