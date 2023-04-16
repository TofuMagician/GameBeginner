public class Trader extends Character{

    public Trader(String name){
        super(name);
        super.setJob("Trader");
    }

    public void transaction(Character character1, Character character2, WeaponMaster weaponMaster){

        for(Integer number : character1.getStore()){
            if(number == weaponMaster.getNumber()){
                System.out.println("장비를 교환하였습니다.");
                character2.getItems(weaponMaster);
                character1.throwItems(weaponMaster);
            }
        }
    }

    public void transaction(Character character1, Character character2, WeaponMaster weaponMaster1, WeaponMaster weaponMaster2){

        transaction(character1, character2, weaponMaster1);
        transaction(character2, character1, weaponMaster2);
    }
}
