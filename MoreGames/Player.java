import java.util.Scanner;
import java.util.Hashtable;

class Player {   
    
    private int playerNum;
    private String name;
    private char playerMark;
    private Hashtable<String, Integer> wins;

    // Constructors
    public Player(){
        this.playerNum = 0;
        this.wins = new Hashtable<String, Integer>();
    }

    public Player(int num){
        this.playerNum = num;
        this.wins = new Hashtable<String, Integer>();
    }
    
    // Accessors
    public int getNum() {
        return this.playerNum;
    }

    public String getName(){
        return this.name;
    }

    public char getMark(){
        return this.playerMark;
    }

    public Hashtable<String, Integer> getWins() {
        return this.wins;
    }

    // Method for set player variables
    public void setPlayerMark(char m) {
        this.playerMark = m;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public void setWins(String game, int score) {
        this.wins.put(game, score);
    }

    public void addWins(String game) {
        this.wins.put(game, this.wins.get(game)+1);
    }

    // Method for players to make a choice
    public void placeMark(Board currentBoard) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Row [0-" + (currentBoard.getRow()-1) + "]: ");
            int row = sc.nextInt();
            System.out.println("Enter Column [0-" + (currentBoard.getCol()-1) + "]: ");
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