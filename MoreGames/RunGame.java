import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RunGame {

    /*
     * This class is designed for controlling the BEFORE and AFTER game
     * process for all three games. Because all games share the same players,
     * the creation of players will be controlled by this class.
     */

    Player player0;
    Player player1;

    public RunGame() {
        this.player0 = new Player(0);
        this.player1 = new Player(1);
    }
    
    // A method for creating game boards according to player's input
    public static List<Integer> setBoard() {
        Scanner sc = new Scanner(System.in);
        List<Integer> board = new ArrayList<>();

        System.out.println("Please enter the size of the game board.\n");

        System.out.println("Number of rows: ");
        int row = sc.nextInt();
        board.add(row);

        System.out.println("Number of columns: ");
        int col = sc.nextInt();
        board.add(col);

        return board;
    }
    
    /*
     * A helper method for set player's input as game rules.
     * This method is made to be static in order to be used for
     * all three games.
     */
    public static int setRule(Board board) {
        Scanner sc = new Scanner(System.in);
        int rule = 0;

        while (true) {
            System.out.println("\nPlease enter your desired winning condition.");
            System.out.println("(Example: Enter 3 for a Three-in-a-Row winning condition.)");

            rule = sc.nextInt();

            if (rule>board.getRow() && rule>board.getCol()) {
                System.out.println("\nToo big! Please re-enter a winning condition that is proper for the board you have created.");
            }
            else {
                break;
            }
        }
        return rule;
    }

    // This method works BEFORE navigating to the menu
    public void startNewGame() {
        Scanner sc = new Scanner(System.in);

        Message.welcome();

        // Set two players for all game in a single run of the program
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

    // The menu for players to pick a game
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
                OAC newgame = new OAC(player0, player1);
                OAC.startGame(newgame);
                break;
            }
            else if (input == 3) {
                Connect4 newgame = new Connect4(player0, player1);
                Connect4.startGame(newgame);
                break;
            }
            else if (input == 4) {
                System.out.println("Bye!\n");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    // This method is called AFTER a game played
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


