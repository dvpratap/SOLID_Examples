import java.util.Random;

public class Player implements PlayerInterface{
    Random ra1 = new Random();
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getLastScore() {
        return lastScore;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }

    public String getLastPlayedDate() {
        return lastPlayedDate;
    }

    public void setLastPlayedDate(String lastPlayedDate) {
        this.lastPlayedDate = lastPlayedDate;
    }

    private String password;
    private int lastScore;
    private String lastPlayedDate;

    private String playerName;
    private int playerHealth = 100;
    private int playerAttackDamage = 25;
    private int healCapacity = 30;
    private int healPotion = 3;
    private int score = 0;
    private int reward = 0;
    private int attack_limit=0;
    private String weapon = "No Weapon";
    String[] sleeves = { "Protagonist", "SwordsMan", "Magician", "Archer"};

    private String sleeve;
    private int sleeveNumber;
    private boolean equipAbility= false;
    public String getSleeve(){
        return sleeve;
    }
    public void setSleeve(String se){
        sleeveNumber = (Integer.parseInt(se))-1;
        sleeve = sleeves[sleeveNumber];
    }
    public void setPlayerName(String name){
        playerName = name;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerHealth(){
        return playerHealth;
    }
    public int getPlayerAttackDamage(){
        return playerAttackDamage;
    }
    public void setPlayerHealth(int hp){
        this.playerHealth+=hp;
    }
    public void setPlayerAttackDamage(int damage){
        this.playerAttackDamage+=damage;
    }

    public void setScore(int score){
        this.score+=score;
    }
    public int getScore(){
        return score;
    }
    public int getHealPotion() {
        return healPotion;
    }

    public int getHealCapacity(){
        return healCapacity;
    }
    public void setHealCapacity(int heal){
        this.healCapacity+= heal;
    }
    public void setEquipAbility(){
        this.equipAbility=true;
    }
    public void setReward(int re){
        this.reward +=re;
    }
    public int getReward(){
        return reward;
    }

    public void setAttack_limit(){
        this.attack_limit = 1;
    }
    public int getAttack_limit(){
        return this.attack_limit;
    }
    public void avatarDisplay(){
        System.out.println("\t ------Select Avatar for Player ------");
        System.out.println("\t  1. Protagonist ");
        System.out.println("\t  2. SwordsMan ");
        System.out.println("\t  3. Magician ");
        System.out.println("\t  4. Archer ");
    }
    public void displayPlayerStatus(){
        System.out.println("\n\t ## "+playerName + "\t ## " +sleeve + " ##");
        if(attack_limit==1) {
            System.out.print("\t ## Attack Power b/w: 0-"+ playerAttackDamage + " ##");
        }
        else
            System.out.print("\t ## Fixed Attack Power: "+ playerAttackDamage + " ##");

        if(reward > 0)
            System.out.print("\t ## Rewards: "+ reward + "#");
        System.out.print("\t ## HP: "+ playerHealth + " #\n");
    }

    public String selectPlayerType(String se){
        int player_type = Integer.parseInt(se);
        switch(player_type){
            case 1:
                setEquipAbility();
                setSleeve(se);
                break;
            case 2:
                setSleeve(se);
                setPlayerAttackDamage(15);
                setPlayerHealth(-15);
                break;
            case 3:
                setSleeve(se);
                setPlayerAttackDamage(25);
                setPlayerHealth(-25);
                break;
            case 4:
                setSleeve(se);
                setPlayerAttackDamage(20);
                setPlayerHealth(-20);
                break;
            default:
                sleeve = "false";
        }
        return sleeve;
    }

    public void displayPlayerSelection(String choice){
        if(!(choice.equals("false")))
            System.out.println("\t-----you have Selected " + choice +"------");
        else
            System.out.println("\t----- Invalid Player Type Selection !!!----------");
    }
    public int drinkHealPotion(){
        if(getHealPotion() > 0){
            playerHealth += healCapacity;
            healPotion--;
            return healPotion;
        }
        else{
            return 0;
        }
    }
    public void displayDrinkHealPotion(){
        System.out.println("you drank a Healing Potion, You got HP: "+ healCapacity +
                "\n\t Now Your Total HP: "+ playerHealth +
                "\n\t You have now Healing Potion Left: "+ healPotion );
    }
    public int getRewardItem(){
        int val = 0;
        if(reward > 0){
            int num = ra1.nextInt(reward);
            if(num%2==0) {
                val = 1;
            }
            else {
                val = 2;
            }
            reward = reward/2;
        }
        return val;
    }

    public void generateRewardItem() {
        int item = getRewardItem();
        if (item == 1) {
            healPotion++;
            System.out.println("\t You have "+getHealPotion() +" healing potions now");
        } else if (item == 2){
            playerAttackDamage += 10;
            System.out.println("Your attack Damage Upgraded to :" +getPlayerAttackDamage());
        }
        else{
            System.out.println("\t ####  No Reward #####");
        }
        System.out.println("\t ## you have "+ reward + " reward Points Now");
    }
    public void ranAway(){
        System.out.println("\t you ran away and hiding ### ");
        int num = ra1.nextInt(60);
        if(num%2==0)
        {
            playerAttackDamage+=5;
            System.out.println("\t You Trained in shadows and Now Your Attack +5:" + playerAttackDamage);
        }
        else{
            playerAttackDamage-=10;
            System.out.println("\t You forgot your training while hiding your attack -10:"+ playerAttackDamage);
        }
    }

}
