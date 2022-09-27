import java.util.Random;
import java.util.Scanner;

public class Dungeon3 implements Dungeon{
    Random ra1 = new Random();
    Scanner input = new Scanner(System.in);
    private int dungeonId = 3;

    public void displayDungeonEnv(Player p1){
        System.out.println("\t ### you are now in Magic village Dungeon ####");
        String sleeve = p1.getSleeve();
        if(sleeve.equals("Magician")) {
            System.out.println("you are a Magician So Dungeon will increase Attack Power");
        }
        else if ((sleeve.equals("Protagonist"))) {
            System.out.println("\t #### You are a Protagonist So Dungeon Environment wont affect you ###");
            System.out.println("\t ### Your attacks will be still effective ###");
        }
        else{
            System.out.println("\t ### You are not a Magician So Dungeon will limit your abilities ###");
            System.out.println("\t ### your attacks will be less effective here ###");
        }
    }
    public void setDungeonEnv(Player p1){
        String sleeve = p1.getSleeve();
        if(sleeve.equals("Magician")){
            p1.setPlayerAttackDamage(5);

        } else if ((sleeve.equals("Protagonist"))) {
            p1.setPlayerHealth(5);
        }
        else{
            p1.setHealCapacity(20);
            p1.setPlayerHealth(-20);
            p1.setPlayerAttackDamage(-10);
            p1.setAttack_limit();
        }
    }
    public int execute_dungeon(Player p1)
    {
        int res = 0;
        Villain v1 = new Villain();
        Game g1 = new Game();
        v1.setVillainList(dungeonId);
        displayDungeonEnv(p1);
        setDungeonEnv(p1);
        v1.setVillainCount();
        int v_count = v1.getVillainCount();
        for(int loop = 0; loop<v_count;loop++)
        {
            System.out.println("----------------------------------------------------------");
            //int villainHealth = ra1.nextInt(v1.getVillainMaxHealth());
            String villain = v1.generateVillain(loop);
            System.out.println("\t# " + villain + " has Appeared! #\n");
            int tok = g1.executeGameDungeon(p1,v1);
            if(tok==0)
                System.out.println("\t Defeated by villain: "+villain);
            if(p1.getPlayerHealth() < 1) {
                res = 0;
                break;
            }
            System.out.println("\t You have defeated the "+ villain + "!!!");
            p1.setScore((loop*10)+100);
            System.out.println("Your Score is : "+p1.getScore());
            int seq= g1.getDungeonSeq();
            int re = 1+loop+seq;
            System.out.println("\t you got " + re + "reward Point !!!");
            p1.setReward(re);
        }
        if(p1.getPlayerHealth() > 1) {
            System.out.println("\t #### You have Cleared the Dungeon, Congrats #####");
            res = 1;
            g1.setDungeonClear(dungeonId);
            g1.setDungeon3_result();
        }
        return res;
    }
}

