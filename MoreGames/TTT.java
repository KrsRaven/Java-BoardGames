import java.util.Scanner;

public class TTT{

    private Board board;
    private int rule;
    
    private Player player0;
    private Player player1;

    // Default constructor for a new Tic Tac Toe game
    public TTT(Player player0, Player player1) {
        this.player0 = player0;
        this.player1 = player1;
        player0.setPlayerMark('O');
        player1.setPlayerMark('X');
    }

    public Board getBoard() {
        return this.board;
    }

    public void setPlayers(Player player0, Player player1) {
        this.player0 = player0;
        this.player1 = player1;
    }

    public void setBoard(int row, int col) {
        this.board = new Board(row, col);
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public static void startGame(TTT newGame) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
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
            Message.playerChoice(newGame.player0);
            newGame.player0.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(newGame.player0);
                newGame.player0.addWins("Tic-Tac-Toe");
                break;
            }
            if (newGame.board.isFull() == true) {
                Message.drawGame();
                break;
            }

            Message.playerChoice(newGame.player1);
            newGame.player1.placeMark(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(newGame.player1);
                newGame.player1.addWins("Tic-Tac-Toe");
                break;
            }
            
            if (newGame.board.isFull() == true) {
                Message.drawGame();
                break;
            }
        }
        RunGame.endGame(newGame.player0, newGame.player1);
    }
    
}
