import java.time.chrono.ChronoLocalDate;
import java.util.LinkedList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Tofu Island");

        Character magician1 = new Magician("Freddie1");
        if(magician1 instanceof Magician){
            System.out.println("캐릭터 생성 성공");
        }

        Character hunter1 = new Hunter("Max1");
        if(hunter1 instanceof Hunter){
            System.out.println("캐릭터 생성 성공");
        }

        Trader trader1 = new Trader("Trader1");
        Enimies oak1 = new Enimies("oak", 3, 4, 30);

        Weapon[] sword = new Sword[3];
        sword[0] = new Sword("fireSword", 5, "Hunter");
        sword[1] = new Sword("waterSword", 10, "Hunter");
        sword[2] = new Sword("treeSword", 15, "Hunter");

        hunter1.getItems((WeaponMaster) sword[0]);
        hunter1.wearInventory((WeaponMaster) sword[0]);
        magician1.getItems((WeaponMaster) sword[1]);
        magician1.wearInventory((WeaponMaster) sword[1]);
        trader1.transaction(hunter1, magician1, (WeaponMaster) sword[0], (WeaponMaster) sword[1]);
        magician1.killingEnmies(oak1);
        magician1.killingEnmies(oak1);
        magician1.killingEnmies(oak1);
        magician1.killingEnmies(oak1);
        sword[0].develope();
    }
}