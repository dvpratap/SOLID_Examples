public class VillainTest {
    Villain v2 = new Villain();
    /*  Test Case 1 */
    public void setVillainMaxHealthTest(){
        v2.setVillainMaxHealth(30);
        if(v2.getVillainMaxHealth() == 130)
            System.out.println("TestCase 1 Passed");
        else
            System.out.println("TestCase 1  Failed");
    }
    /* Test Case 2 */
    public void setVillainListTest(){
        boolean check = v2.setVillainList(2);
        if(check)
            System.out.println("TestCase 2 Passed");
        else
            System.out.println("TestCase 2 Failed");
    }
    /* Test Case 3 */
    public void setVillainListTestFail(){
        boolean check = v2.setVillainList(5);
        if(check)
            System.out.println("TestCase 3 Passed");
        else
            System.out.println("TestCase 3 Failed");
    }
    /* Test Case 4 */
    public void generateVillainTestFail(){
        String villain = v2.generateVillain(6);
        if(villain.equals("NoVillain"))
            System.out.println("TestCase 4 Passed");
        else
            System.out.println("TestCase 4 Failed");
    }
    /* Test Case 5 */
    public void generateVillainTestPass()
    {
        v2.setVillainList(1);
        String villain = v2.generateVillain(2);
        if(villain.equals("NoVillain"))
            System.out.println("TestCase 5 Failed");
        else
            System.out.println("TestCase 5 Passed");
    }
    /* Run All test Cases for Villain Class */
    public void runVillainClassTestCases(){
        System.out.println("\t ## Running Villain Class Test Cases ##");
        setVillainMaxHealthTest();
        setVillainListTest();
        setVillainListTestFail();
        generateVillainTestFail();
        generateVillainTestPass();
    }
}
