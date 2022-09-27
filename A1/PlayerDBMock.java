public class PlayerDBMock implements PlayerDBInterface{

        public void getLoginDetails(Player p1){
            p1.setUsername("Lucifer");
            p1.setPassword("Game123");
        }
        public void loadPlayerData(Player p1){
                p1.setLastScore(3200);
                p1.setLastPlayedDate("24-Sep-2022 14:45:34");
        }


}
