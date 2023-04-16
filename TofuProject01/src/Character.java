import java.util.LinkedList;

public class Character {
    private String name;
    private int level;
    private String job;
    private int experience;
    private int max = 100; // 장비 최대 갯수
    private int i; // 얻은 장비 갯수
    private int num; // 캐릭터 고유 번호
    private int inventory;
    private static int count;
    LinkedList<Integer> store = new LinkedList<>();


    public Character(String name){
        this.name = name;
        this.level = 1;
        this.experience = 0;
        i = 0;
        num = getCount(); // 공통변수로 캐릭터 고유번호 부여
    }

    public void experienceUp(int increase){
        this.experience += increase;
        if(experience > 2000 + (level * 50)){
                this.level += 1;
            System.out.println("레벨업을 하셨습니다.");
                max++; // 레벨업이 될 시 장비량 +1 시킴
        }
        System.out.println("경험치 " + increase + "를 얻었습니다.");
    }

    public void getItems (WeaponMaster weaponMaster){
        if(i <= max) {
            store.add(weaponMaster.pickitems());
            System.out.println(this.name + "(이)가 " + weaponMaster.getName() + "을 얻었습니다.");
            i++; // 받은 갯수 증가
        }

        else{
            System.out.println("장비의 갯수가 모두 가득찼습니다.");
        }
    }

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return (this.job);
    }

    public void wearInventory(WeaponMaster weaponMaster){
        for(Integer number : store ) {
            if (number == weaponMaster.pickitems()) {
                if (this.job.equals(weaponMaster.getJobLimited())) {
                    System.out.println(this.name + "(이)가 " + weaponMaster.getName() + "을 장착하였습니다.");
                    this.inventory = number; // 무기장착
                } else {
                    System.out.println("이 장비는 착용할 수 없습니다.");
                }
            }
        }
    }

    public void throwItems(WeaponMaster weaponMaster){
        for(Integer number : store){
            if(number == weaponMaster.getNumber()){
                    store.remove(number);
            }
        }
        i--; // 읽어버린 갯수 1개 증가
    }

    public int getCount(){
        this.count++;
        return this.count;
    }

    public int getMax(){
        return this.max;
    }

    public int getLevel(){
        return this.level;
    }

    public Integer[] getStore(){
        return store.toArray(new Integer[store.size()]); // 배열형태로 반환값 저장
    }

    public void killingEnmies(Enimies enimies){
        enimies.changePower(this);
    }
}
