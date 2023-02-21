import java.util.List;

public class TTT{

    /*
     * This class is created for the game Tic-Tac-Toe. In my implementation
     * of TTT, there are two players, and their marks are 'X' and 'O' as default.
     * The winning condition and board size can be changed without influencing
     * other games.
     */

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

    // The method for controlling the main process of a Tic-Tac-Toe game
    public static void startGame(TTT newGame) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        List<Integer> boardSize = RunGame.setBoard();
        newGame.setBoard(boardSize.get(0), boardSize.get(1));

        newGame.setRule(RunGame.setRule(newGame.getBoard()));
    
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
