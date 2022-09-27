//import java.io.DataInput;
import java.util.Random;
import java.util.Scanner;

public class Game implements GameInterface{
    Random ra1 = new Random();
    Scanner input = new Scanner(System.in);
    private int testMode;
    private int highScore = 0;
    private static int dungeonSeq=0;

    private int damageTaken=0;
    private int damageDone=0;
    private static int dungeon_clear=0;
    public void setDungeonClear(int id){
        dungeon_clear= id;
    }
    public void setTestMode(int mode){
        testMode=mode;
    }
    public int getTestMode(){
        return testMode;
    }
    public void setHighScore(int score) {
         highScore= score;
    }
    public void setDungeonSeq(){
        dungeonSeq++;
    }
    public int getDungeonSeq(){
        return dungeonSeq;
    }

    private int dungeon1_result = 0;
    private int dungeon2_result = 0;
    private int dungeon3_result = 0;

    public int getHighScore() {
        return highScore;
    }
    public void setDungeon1_result(){
        dungeon1_result = 1;
    }
    public void setDungeon2_result(){
        dungeon2_result= 1;
    }
    public void setDungeon3_result(){
        dungeon3_result=1;
    }

    public void gameFirstDisplay() {
        System.out.println("\t Welcome to King of Dungeons Game !!!");
        System.out.println("\t Three years ago during magical catastrophe your country got destroyed ");
        System.out.println("\t After that 3 Dungeons appeared in 3 different lands ");
        System.out.println("\t ### You need to clear all 3 dungeons to reverse the time and save your Country ###");
    }

    public void displayAttackChoice() {
        System.out.println("\n\t What would you like to do ?");
        System.out.println("\t1. Attack");
        System.out.println("\t2. Drink Healing Potion");
        System.out.println("\t3. Run");
        System.out.println("\t4. Choose a Reward ");
    }

    public void displayDungeonChoice() {
        System.out.println("\n\t Which Dungeon would you like to Enter First ?");
        System.out.println("\t1. Sword village Dungeon");
        System.out.println("\t2. Elves village Dungeon");
        System.out.println("\t3. Magic village Dungeon");
    }

    public void displayDungeonChoices(){
        switch (dungeon_clear){
            case 1:
                System.out.println("\n\t #####  You have Cleared Sword Village Dungeon #######");
                System.out.println("\t Select your Next Dungeon: ");
                System.out.println("\t2. Elves village Dungeon");
                System.out.println("\t3. Magic village Dungeon");
                break;
            case 2:
                System.out.println("\n\t #####  You have Cleared Elves Village Dungeon #######");
                System.out.println("\t Select your Next Dungeon: ");
                System.out.println("\t1. Sword village Dungeon");
                System.out.println("\t3. Magic village Dungeon");
                break;
            case 3:
                System.out.println("\n\t #####  You have Cleared Magic Village Dungeon #######");
                System.out.println("\t Select your Next Dungeon: ");
                System.out.println("\t1. Sword village Dungeon");
                System.out.println("\t2. Elves village Dungeon");
                break;
            default:
                System.out.println("\t ---- Invalid Selection ------");
        }

    }

    public int dungeonSelection(String se, Player p1){
        Dungeon1 d1 = new Dungeon1();
        Dungeon2 d2 = new Dungeon2();
        Dungeon3 d3 = new Dungeon3();
        int res = 0;
        int choice  = Integer.parseInt(se);
        if((choice == 1) && (dungeon1_result != 1)){
            if(testMode==0) {
                res = d1.execute_dungeon(p1);
                dungeon1_result = res;
            }
            else
                res=1;
        }
        else if((choice == 2) && (dungeon2_result != 1)) {
            if(testMode==0) {
                res = d2.execute_dungeon(p1);
                dungeon2_result = res;
            }
            else
                res=2;
        }
        else if((choice == 3) && (dungeon3_result != 1)) {
            if(testMode==0) {
                res = d3.execute_dungeon(p1);
                dungeon3_result = res;
            }
            else{
                res=3;
            }
        }
        else{
            if(testMode==0) {
                System.out.println("\t ------Invalid Selection ----");
            }
            else
                res=0;
        }
        if(res == 0)
            return 0;
        else
            return 1;
        }
    public void fight(Player p1, Villain v1){
        if(p1.getAttack_limit()== 1)
            damageDone =ra1.nextInt(p1.getPlayerAttackDamage());
        else
            damageDone = p1.getPlayerAttackDamage();
        damageTaken = ra1.nextInt(v1.getVillainAttackDamage());
        p1.setScore(damageDone);

        v1.setVillainMaxHealth(-damageDone);
        p1.setPlayerHealth(-damageTaken);
    }
    public void displayFight(Villain v1){
        System.out.println("\t Your stroke the " + v1.getVillain() + " for: " + damageDone + " damage !!!");
        System.out.println("\t You got hit by " + damageTaken + " damage in retaliation !!!");
    }
    public int validDungeonSelection(String se){
        int choice = Integer.parseInt(se);
        int res =0;
        if(choice > 0 && choice < 4)
            res =1;
        return res;
    }
    public int validDungeonSelection2(String se){
        int choice = Integer.parseInt(se);
        int val;
        if(dungeon1_result == 1)
            val = 1;
        else if (dungeon2_result == 1)
            val = 2;
        else
            val = 3;
        int res =0;
        if(choice > 0 && choice < 4)
            if(choice != val)
                res = 1;
        return res;
    }
    public void showGameStatus(Player p1,Villain v1){
        p1.displayPlayerStatus();
        v1.displayVillainStatus();
    }
    public void displayFailedMessage(){
        System.out.println("\t ## You have Failed to Clear Dungeon, Try Next Time !!!");
    }
    public void displayKingOfDungeon(){
        System.out.println("\t ##### You have Cleared All Three Dungeons and Saved the Kingdom !!!!! Congrats !!!");
    }

    public int executeGameDungeon(Player p1, Villain v1){
        int res =1;
        while (v1.getVillainMaxHealth() > 0) {
            showGameStatus(p1, v1);
            displayAttackChoice();
            String entry = input.nextLine();
            if (entry.equals("1")) {
                fight(p1, v1);
                displayFight(v1);
                if (p1.getPlayerHealth() < 1) {
                    System.out.println("\t Your HP is too low, You are too hurt to go on !");
                    res=0;
                    break;
                }
            } else if (entry.equals("2")) {
                int val = p1.drinkHealPotion();
                if (val < 1) {
                    System.out.println("\t you have no Healing item left, Defeat villain to get One!!");
                }
                else
                    p1.displayDrinkHealPotion();
            } else if (entry.equals("3")) {
                p1.ranAway();
            } else if (entry.equals("4")) {
                int re = p1.getReward();
                if (re > 0) {
                    p1.generateRewardItem();
                } else {
                    System.out.println("\t You dont have any reward Points");
                }
            } else {
                System.out.println("Invalid option");
            }
        }
        return res;
    }

}