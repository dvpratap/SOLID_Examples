public interface GameInterface {
    void displayAttackChoice();
    void displayDungeonChoice();
    void fight(Player p1, Villain v1);
    void displayFight(Villain v1);
    int dungeonSelection(String se, Player p1);
    int executeGameDungeon(Player p1, Villain v1);
}
