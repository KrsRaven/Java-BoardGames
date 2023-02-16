import java.util.Scanner;

public class TTT {

    public static void startGame() {
        Scanner sc = new Scanner(System.in);

        Player player0 = new Player(0);
        Player player1 = new Player(1);
        player0.setPlayerMark('O');
        player1.setPlayerMark('X');

        Board TTTBoard = new Board(3);

        System.out.println("Welcome to Tic-Tac-Toe!\n");
        TTTBoard.printBoard();
        System.out.println();

        while (true) {
            Message.playerChoice(player0);
            player0.placeMark(TTTBoard);
            TTTBoard.printBoard();

            if (player0.isWin(TTTBoard) == true) {
                Message.congratulation(player0);
                break;
            }
            if (TTTBoard.isFull() == true) {
                Message.drawGame();
                break;
            }

            Message.playerChoice(player1);
            player1.placeMark(TTTBoard);
            TTTBoard.printBoard();

            if (player1.isWin(TTTBoard) == true) {
                Message.congratulation(player1);
                break;
            }
            
            if (TTTBoard.isFull() == true) {
                Message.drawGame();
                break;
            }
        }
        RunGame.endGame();
    }
}
