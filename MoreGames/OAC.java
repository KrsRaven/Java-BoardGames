import java.util.List;
import java.util.Scanner;

public class OAC {

    /*
     * This class is created for the game Order and Chaos. In my implementation
     * of the game, there are two players, and their marks can be
     * chosen from 'X' and 'O' in each turn.
     * The winning condition and board size can be changed without influencing
     * other games.
     */

    private Board board;
    private int rule;
    
    private Player player0;
    private Player player1;

    // Default constructor for a new game
    public OAC(Player player0, Player player1) {
        this.player0 = player0;
        this.player1 = player1;
    }

    // Accessor methods for getting the game board
    public Board getBoard() {
        return this.board;
    }

    // Methods for changing game settings
    public void setBoard(int row, int col) {
        this.board = new Board(row, col);
    }

    public void setRule(int rule) {
        this.rule = rule;
    }
    

    public void setRole(Player player0, Player player1) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        System.out.println("\nPlease pick your side. The player that picks Order will start first.");
        System.out.println("Please enter the name of the player who wants to be ORDER: ");

        while (true) {
            name = sc.nextLine().toLowerCase();

            if (name.equals(player0.getName().toLowerCase())) {
                player0.setOrder(0);
                player1.setOrder(1);
                break;
            }
            else if(name.equals(player1.getName().toLowerCase())){
                player1.setOrder(0);
                player0.setOrder(1);
                break;
            }
            else {
                System.out.println("No player found. Please re-enter your name.");
            }
        }
    }

    // The method for controlling the main process of a OAC game
    public static void startGame(OAC newGame) {
        System.out.println("Welcome to Order and Chaos!");

        List<Integer> boardSize = RunGame.setBoard();
        newGame.setBoard(boardSize.get(0), boardSize.get(1));

        newGame.setRule(RunGame.setRule(newGame.getBoard()));

        newGame.setRole(newGame.player0, newGame.player1);
        Player order = newGame.player0;
        Player chaos = newGame.player1;

        if (newGame.player0.getOrder() == 0) {
            order = newGame.player0;
            chaos = newGame.player1;
        }
        else {
            order = newGame.player1;
            chaos = newGame.player0;
        }

        System.out.println();
        newGame.board.printBoard();
        System.out.println();

        while (true) {
            order.chooseMark();
            System.out.println();
            Message.playerChoice(order);
            
            order.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(order);
                order.addWins("Order and Chaos");
                break;
            }
            if (newGame.board.isFull() == true) {
                Message.congratulation(chaos);
                chaos.addWins("Order and Chaos");
                break;
            }

            chaos.chooseMark();
            System.out.println();
            Message.playerChoice(chaos);

            chaos.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(order);
                order.addWins("Order and Chaos");
                break;
            }
            
            if (newGame.board.isFull() == true) {
                Message.congratulation(chaos);
                chaos.addWins("Order and Chaos");
                break;
            }
        }
        RunGame.endGame(newGame.player0, newGame.player1);
    }
}
