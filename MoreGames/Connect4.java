import java.util.List;

public class Connect4 extends RunGame{
    private Board board;
    private int rule;
    
    private Player player0;
    private Player player1;

    // Default constructor for a new Connect-4 game
    public Connect4(Player player0, Player player1) {
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
    public static void startGame(Connect4 newGame) {
        System.out.println("Welcome to Connect-4!");
        
        List<Integer> boardSize = RunGame.setBoard();
        newGame.setBoard(boardSize.get(0), boardSize.get(1));

        newGame.setRule(RunGame.setRule(newGame.getBoard()));
    
        newGame.board.printBoard();
        System.out.println();

        while (true) {
            Message.playerChoice(newGame.player0);
            newGame.player0.placeMarkCol((newGame.board));;
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(newGame.player0);
                newGame.player0.addWins("Connect-4");
                break;
            }
            if (newGame.board.isFull() == true) {
                Message.drawGame();
                break;
            }

            Message.playerChoice(newGame.player1);
            newGame.player1.placeMarkCol(newGame.board);
            newGame.board.printBoard();

            if (Board.isWin(newGame.board, newGame.rule) == true) {
                Message.congratulation(newGame.player1);
                newGame.player1.addWins("Connect-4");
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
