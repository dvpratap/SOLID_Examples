public class PlayerTest {

    Player player1 = new Player();
    public void drinkHealPotionTest(){
        int currentHealth = player1.getPlayerHealth();
        int numPotion = player1.getHealPotion();
        int newNum =player1.drinkHealPotion();
        int newHealth = currentHealth+player1.getHealCapacity();
        if((newNum==(numPotion-1)) && (newHealth==player1.getPlayerHealth()))
            System.out.println("TestCase 1 Passed");
        else
            System.out.println("TestCase 1 Failed !!!");
    }
    /* Test Case 2 */
    public void selectPlayerTestPass(){
        String avatar = player1.selectPlayerType("2");
        if(avatar.equals("SwordsMan"))
            System.out.println("TestCase 2 Passed");
        else
            System.out.println("TestCase 2 Failed !!!");
    }
    /* Test Case 3 */
    public void selectPlayerTestFail(){
        String avatar = player1.selectPlayerType("5");
        if(avatar.equals("false"))
            System.out.println("TestCase 3 Passed");
        else
            System.out.println("TestCase 3 Failed !!!");
    }
    /* Test Case 4 */
    public void getRewardItemTestSuccess(){
        player1.setReward(3);
        int val = player1.getRewardItem();
        if(val >0 && val <3)
            System.out.println("TestCase 4 Passed");
        else
            System.out.println("TestCase 4 Failed");
    }
    public void getRewardItemTestFail(){
        int val = player1.getRewardItem();
        if(val >0 && val <3)
            System.out.println("TestCase 5 Passed");
        else
            System.out.println("TestCase 5 Failed");
    }
    public void runPlayerClassTestCases(){
        System.out.println("\t ## Running Player Class Test Cases ##");
        drinkHealPotionTest();
        selectPlayerTestPass();
        selectPlayerTestFail();
        getRewardItemTestSuccess();
        getRewardItemTestFail();
    }
}
