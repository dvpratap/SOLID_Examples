/* Decompiler 5ms, total 279ms, lines 64 */
import java.util.Scanner;

public class Main {
    public static int test_mode;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("\t ## Enter Run Mode: \n\t 1. Run Game \n\t 2. Run Test Suit");
            String mode = input.nextLine();
            if (mode.equals("1")) {
                test_mode = 0;
                choice=1;
            } else if (mode.equals("2")) {
                test_mode = 1;
                choice=1;
            }
            else {
                System.out.println("----Enter Correct Choice----");
            }
        }while(choice==0);
        if (test_mode == 0) {
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
        else{
            System.out.println("\t Running All test Cases :");
            MainTest m1 = new MainTest();
            m1.runAllTestCases();
        }

    }
}

