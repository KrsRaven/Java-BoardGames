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