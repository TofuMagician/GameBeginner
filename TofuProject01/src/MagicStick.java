public class MagicStick extends WeaponMaster implements Weapon{
    private int k;
    public MagicStick(String name, int levelLimited, String jobLimited){
        super(name, levelLimited, jobLimited);
    }

    @Override
    public void develope() {
            setAbility();
    }
}
