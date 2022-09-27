public class TestAllDungeonClass {
    Game g1 = new Game();
    Dungeon1 d1 = new Dungeon1();
    Dungeon2 d2 = new Dungeon2();
    Dungeon3 d3 = new Dungeon3();
    /* test case 1*/
    public void setSwordEnvTest1(){
        Player p1 = new Player();
        p1.setSleeve("2");
        d1.setDungeonEnv(p1);
        if(p1.getPlayerAttackDamage()==30)
            System.out.println("TestCase 1 Passed");
        else
            System.out.println("TestCase 1 Failed");
    }
    public void setSwordEnvTest2(){
        Player p1 = new Player();
        p1.setSleeve("3");
        d1.setDungeonEnv(p1);
        if(p1.getAttack_limit()==1)
            System.out.println("TestCase 2 Passed");
        else
            System.out.println("TestCase 2 Failed");
    }

    /* test case 3*/
    public void setElfEnvTest1(){
        Player p1 = new Player();
        p1.setSleeve("4");
        d2.setDungeonEnv(p1);
        if(p1.getPlayerAttackDamage()==30)
            System.out.println("TestCase 3 Passed");
        else
            System.out.println("TestCase 3 Failed");
    }
    /* Test Case 4 */
    public void setElfEnvTest2(){
        Player p1 = new Player();
        p1.setSleeve("2");
        d2.setDungeonEnv(p1);
        if(p1.getAttack_limit()==1)
            System.out.println("TestCase 4 Passed");
        else
            System.out.println("TestCase 4 Failed");
    }
    /* test case 5*/
    public void setMagicEnvTest1(){
        Player p1 = new Player();
        p1.setSleeve("3");
        d3.setDungeonEnv(p1);
        if(p1.getPlayerAttackDamage()==30)
            System.out.println("TestCase 5 Passed");
        else
            System.out.println("TestCase 5 Failed");
    }
    /* Test Case 6 */
    public void setMagicEnvTest2(){
        Player p1 = new Player();
        p1.setSleeve("4");
        d3.setDungeonEnv(p1);
        if(p1.getAttack_limit()==1)
            System.out.println("TestCase 6 Passed");
        else
            System.out.println("TestCase 6 Failed");
    }

    public void runAllDungeonClassTestCases() {
        g1.setTestMode(1);
        System.out.println("\t ## Running All Dungeon Classes Test Cases ##");
        setSwordEnvTest1();
        setSwordEnvTest2();
        setElfEnvTest1();
        setElfEnvTest2();
        setMagicEnvTest1();
        setMagicEnvTest2();
    }
}
