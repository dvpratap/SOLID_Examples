public class PlayerDBTest {
    Player p1 = new Player();
    PlayerDBMock db1 = new PlayerDBMock();

    /* testing User Authentication */
    public void getLoginDetailsTest(){
        db1.getLoginDetails(p1);
        System.out.println("\t Running DB Mocking TestCases: ");
        if((p1.getUsername()).equals("Lucifer") && (p1.getPassword()).equals("Game123"))
            System.out.println("TestCase 1 passed");
        else
            System.out.println("TestCase 1 Failed");

    }
    public void loadPlayerDataTest(){
        db1.loadPlayerData(p1);
        if((p1.getLastScore()==3200) && ((p1.getLastPlayedDate()).equals("24-Sep-2022 14:45:34")))
            System.out.println("TestCase 2 Passed");
        else
            System.out.println("TestCase 2 Failed");

    }

}
