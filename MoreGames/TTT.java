import java.util.Scanner;

public class TTT{

    private Board board;
    private int numPlayers;
    private int rule;
    private int numGame;
    private int[] record;

    // Default constructor for a new Tic Tac Toe game
    public TTT() {
        this.numGame = 0;
    }

    public int getNumGame() {
        return this.numGame;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(int row, int col) {
        this.board = new Board(row, col);
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public static void startGame() {
        Scanner sc = new Scanner(System.in);

        Player player0 = new Player(0);
        Player player1 = new Player(1);
        player0.setPlayerMark('O');
        player1.setPlayerMark('X');

        TTT newGame = new TTT();

        System.out.println("Welcome to Tic-Tac-Toe!\n");
        System.out.println("Please enter the size of the game board.\n");
        System.out.println("Number of rows: ");
        
        int row = sc.nextInt();

        System.out.println("Number of columns: ");
        int col = sc.nextInt();

        newGame.setBoard(row, col);

        System.out.println("\nPlease enter your desired winning condition.");
        System.out.println("(Example: Enter 3 for a Three-in-a-Row winning condition.)");

        newGame.setRule(sc.nextInt());
    
        newGame.board.printBoard();
        System.out.println();

        while (true) {
            Message.playerChoice(player0);
            player0.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(player0);
                break;
            }
            if (newGame.board.isFull() == true) {
                Message.drawGame();
                break;
            }

            Message.playerChoice(player1);
            player1.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(player1);
                break;
            }
            
            if (newGame.board.isFull() == true) {
                Message.drawGame();
                break;
            }
        }
        RunGame.endGame();
    }
    
}
