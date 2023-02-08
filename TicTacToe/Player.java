import java.util.Scanner;

class Player {   
    
    private int playerNum;
    private char playerMark;

    // Constructors
    public Player(){
        this.playerNum = 0;
    }

    public Player(int num){
        this.playerNum = num;
    }
    
    // Accessors
    public int getNum() {
        return this.playerNum;
    }

    public char getMark(){
        return this.playerMark;
    }

    // Method for set player variables
    public void setPlayerMark(char m) {
        this.playerMark = m;
    }

    // Check if there is a winner
    public Boolean isWin(Board board) {
        Boolean isWin = false;

        int count = 0;

        // Check row win condition
        for (int i=0; i<board.getRow(); i++) {
            count = 0;

            for (int j=0; j<board.getCol(); j++) {
                if (board.getCell(i, j).getMark() == playerMark) {
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
                if (board.getCell(i, j).getMark() == playerMark) {
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
    
            if (board.getCell(i, i).getMark() == playerMark) {
                count++;
            }
        }
        if (count == board.getBoardSize()) {
            isWin = true;
        }

        // Check anti diagonal win condition
        count = 0;
        for (int i=0, j=board.getCol()-1; i<board.getRow() && j>=0; i++, j--) {

            if (board.getCell(i, j).getMark() == playerMark) {
                count++;
            }

        }
        if (count == board.getBoardSize()) {
            isWin = true;
        }

        return isWin;
    }

    // Method for players to make a choice
    public void placeMark(Board currentBoard) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Row [0-" + (currentBoard.getBoardSize()-1) + "]: ");
            int row = sc.nextInt();
            System.out.println("Enter Column [0-" + (currentBoard.getBoardSize()-1) + "]: ");
            int col = sc.nextInt();
            System.out.println();

            if (currentBoard.isValid(row, col) == false) {
                System.out.println("Invalid choice. Please try again.\n");
            }
            else {
                currentBoard.getCell(row, col).setMark(playerMark);
                break;
            }
        }
    }
}