import java.util.Scanner;

public class RunGame {

    public static void startNewGame() {
        Scanner sc = new Scanner(System.in);

        Message.welcome();

        // Set two players for all game in a single run of the program
        Player player0 = new Player(0);
        Player player1 = new Player(1);
        player0.setWins("Tic-Tac-Toe", 0);
        player1.setWins("Tic-Tac-Toe", 0);
        player0.setWins("Order and Chaos", 0);
        player1.setWins("Order and Chaos", 0);
        player0.setWins("Connect-4", 0);
        player1.setWins("Connect-4", 0);

        System.out.println("\nPlayer 1, please enter your name: ");
        String name1 = sc.nextLine();
        player0.setPlayerName(name1);

        System.out.println("\nPlayer 2, please enter your name: ");
        String name2 = sc.nextLine();
        player1.setPlayerName(name2);

        // Move to the menu
        gameChoice(player0, player1);
    }

    public static void gameChoice(Player player0, Player player1) {
        Message.displayMenu();  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Your choice:");
            int input = sc.nextInt();

            System.out.println();

            if (input == 1) {
                TTT newgame = new TTT(player0, player1);
                TTT.startGame(newgame);
                break;
            }
            else if (input == 2) {
                System.out.println("This game is not available for now. Please make another choice.\n");
            }
            else if (input == 3) {
                System.out.println("Bye!\n");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    public static void endGame(Player player0, Player player1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here are your records of wins!\n");
        System.out.println("Player: " + player0.getName());
        System.out.println(player0.getWins().toString());
        System.out.println("\nPlayer: " + player1.getName());
        System.out.println(player1.getWins().toString());
        
        System.out.println("\nWould you like to play another game? Press 'Y' for continue, press any other key to exit.");
        String continueGame = sc.nextLine();
        System.out.println();

        if (continueGame.toLowerCase().equals("y")) {
            gameChoice(player0, player1);
        }
        else {
            System.out.println("Thank you for playing. Bye! \n");
        }
    }
}


