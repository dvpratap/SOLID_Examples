public class MainTest {
    public void runAllTestCases() {
        Game game1 = new Game();
        game1.setTestMode(1);
        PlayerTest pt1 = new PlayerTest();
        pt1.runPlayerClassTestCases();
        VillainTest vt1 = new VillainTest();
        vt1.runVillainClassTestCases();
        GameTest gt1 = new GameTest();
        gt1.runGameClassTestCases();
        TestAllDungeonClass t1 = new TestAllDungeonClass();
        t1.runAllDungeonClassTestCases();
        PlayerDBTest dbT1 = new PlayerDBTest();
        dbT1.getLoginDetailsTest();
        dbT1.loadPlayerDataTest();
    }
}
