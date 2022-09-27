public class GameTest {
    Game g1 = new Game();
    Villain v1 = new Villain();
    Player p1 = new Player();
    public void dungeonSelectionTest()
    {
        int res = g1.dungeonSelection("3",p1);
        if(res==1)
            System.out.println("TestCase 1 Passed");
        else
            System.out.println("TestCase 1 Failed");
    }
    /* Test Case 2 */
    public void fightTest(){
        int ph = p1.getPlayerHealth();
        g1.fight(p1,v1);
        if((ph > p1.getPlayerHealth()) && (v1.getVillainMaxHealth()==75))
            System.out.println("TestCase 2 Passed");
        else
            System.out.println("TestCase 2 Failed");
    }
    /* Test Case 3 */
    public void validDungeonSelection2Test(){
        g1.setDungeon1_result();
        int res = g1.validDungeonSelection2("2");
        if(res ==1 )
            System.out.println("TestCase 3 Passed");
        else
            System.out.println("TestCase 3 Failed");
    }
    /* test Case 4 */
    public void validDungeonSelectionTest()
    {
        int res= g1.validDungeonSelection("7");
        if(res ==1 )
            System.out.println("TestCase 4 Failed");
        else
            System.out.println("TestCase 4 Passed");
    }
    public void runGameClassTestCases(){
        g1.setTestMode(1);
        System.out.println("\t ## Running Game Class Test Cases ##");
        dungeonSelectionTest();
        fightTest();
        validDungeonSelection2Test();
        validDungeonSelectionTest();
    }
}
