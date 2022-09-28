/* Decompiler 5ms, total 279ms, lines 64 */
import java.util.Scanner;

public class Main {
    public static String test_mode;
    public static void main(String[] args) throws Exception {

        int choice=0;
	if(args.length > 0)
        	test_mode = args[0];
	else{
		System.out.println("Test Not Entered, so running Game :\n");
		test_mode = "Dummy";
	}	
        if(!(test_mode.equalsIgnoreCase("Test")))
        {
            Scanner input = new Scanner(System.in);
            Game game1 = new Game();
            Player p1 = new Player();
            game1.gameFirstDisplay();
            String check;
            System.out.println("\t Enter Player name: --");
            String name = input.nextLine();
            p1.setPlayerName(name);
            do {
                p1.avatarDisplay();
                String entry = input.nextLine();
                check = p1.selectPlayerType(entry);
                p1.displayPlayerSelection(check);
            } while (check.equals("false"));

            String dChoice;
            do {
                game1.displayDungeonChoice();
                dChoice = input.nextLine();
                choice = game1.validDungeonSelection(dChoice);
            } while (choice == 0);

            int game_res = game1.dungeonSelection(dChoice, p1);
            if (game_res == 0) {
                game1.displayFailedMessage();
            }

            game1.setDungeonSeq();
            if (game_res == 1) {
                System.out.println("\t Choose Next Dungeon");

                while (true) {
                    game1.displayDungeonChoices();
                    dChoice = input.nextLine();
                    choice = game1.validDungeonSelection2(dChoice);
                    if (choice != 0) {
                        game_res = game1.dungeonSelection(dChoice, p1);
                        if (game_res == 0) {
                            game1.displayFailedMessage();
                        }

                        game1.setDungeonSeq();
                        break;
                    }
                }
            }
            if (game_res == 1) {
                dChoice = "3";
                game_res = game1.dungeonSelection(dChoice, p1);
                if (game_res == 0) {
                    game1.displayFailedMessage();
                    return;
                }
            }
            if(game_res ==1)
                game1.displayKingOfDungeon();
        }
        else
        {
            System.out.println("\t Running All test Cases :");
            MainTest m1 = new MainTest();
            m1.runAllTestCases();
        }

    }
}

