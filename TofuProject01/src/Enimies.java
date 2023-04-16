public class Enimies {
    private String name;
    private int level;
    private int power;
    private boolean live;
    private int giveExperience;

    public Enimies(String name, int level, int power, int giveExperience){
        this.name = name;
        this.level = level;
        this.power = power;
        this.giveExperience = giveExperience;
        this.live = true;
    }

    public void changePower(Character character){
        power -= character.getLevel();
        if(this.power <= 0){
            this.live = false;
            System.out.println("캐릭터가 죽었습니다.");
            character.experienceUp(this.giveExperience);
        }
    }
}
