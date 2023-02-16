import java.util.Scanner;

public class TTT {

    // Check if there is a winner
    public static Boolean isWin(Board board, Player player) {
        Boolean isWin = false;

        int count = 0;

        // Check row win condition
        for (int i=0; i<board.getRow(); i++) {
            count = 0;

            for (int j=0; j<board.getCol(); j++) {
                if (board.getCell(i, j).getMark() == player.getMark()) {
                    count++;
                }
            }

            if (count == board.getBoardSize()) {
                isWin = true;
            }
        }

        // Check column win condition
        for (int j=0; j<board.getCol(); j++) {
            count = 0;

            for (int i=0; i<board.getRow(); i++) {
                if (board.getCell(i, j).getMark() == player.getMark()) {
                    count++;
                }
            }

            if (count == board.getBoardSize()) {
                isWin = true;
            }
        }

        // Check diagonal win condition
        count = 0;
        for (int i=0; i<board.getBoardSize(); i++) {
    
            if (board.getCell(i, i).getMark() == player.getMark()) {
                count++;
            }
        }
        if (count == board.getBoardSize()) {
            isWin = true;
        }

        // Check anti diagonal win condition
        count = 0;
        for (int i=0, j=board.getCol()-1; i<board.getRow() && j>=0; i++, j--) {

            if (board.getCell(i, j).getMark() == player.getMark()) {
                count++;
            }

        }
        if (count == board.getBoardSize()) {
            isWin = true;
        }

        return isWin;
    }

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

            if (isWin(TTTBoard, player0) == true) {
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

            if (isWin(TTTBoard, player1) == true) {
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
