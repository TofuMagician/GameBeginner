import java.util.Random;

public class WeaponMaster {
    private String name;
    private int levelLimited;
    private String jobLimited;
    private int ability;
    private int number;
    private static int count;
    private int k;

    Random random = new Random();

    public WeaponMaster(String name, int levelLimited, String jobLimited){
        this.name = name;
        this.levelLimited = levelLimited;
        this.jobLimited = jobLimited;
        this.ability = 0;
        this.number = countPlus();
        this.k = 5;
    }

    public void setAbility(){
        if(random.nextBoolean() == true && k > 0) {
            this.ability++;
            System.out.println("강화에 성공하였습니다.");
        }

        else{

            System.out.println("강화에 실패하였습니다.");
        }
        k--;
    }
    public String getName(){
        return this.name;
    }

    public int getLevelLimited(){
        return this.levelLimited;
    }

    public String getJobLimited(){
        return this.jobLimited;
    }

    public int pickitems(){
            return this.number;
    }

    public int countPlus(){
        this.count++;
        return this.count;
    }

    public int getNumber(){
        return this.number;
    }
}
