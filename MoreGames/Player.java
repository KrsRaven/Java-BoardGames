import java.util.Scanner;
import java.util.Currency;
import java.util.Hashtable;

class Player {
    
    /*
     * This class is designed for storing and changing players' information.
     * The number of a player (not seen by players), the name, mark used in game and
     * winning records for a players are included.
     * 
     * Besides, the method for each player to place their mark on the board is in
     * this class because this action is always related to a player.
     */
    
    private int playerNum;
    private int order;
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

    public int getOrder() {
        return this.order;
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

    public void setOrder(int order) {
        this.order = order;
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

    /* 
     * Method for a player to choose their mark for the current turn,
     * mainly used in Order and Chaos because this game allow one player
     * use different marks
     */
    public void chooseMark() {
        Scanner sc = new Scanner(System.in);
        char mark = ' ';
        
        while (true) {
            System.out.println(this.name + ", please pick a mark to place. (X OR O)");
            String input = sc.nextLine().toUpperCase();
            mark = input.charAt(0);

            if(mark == 'O') {
                this.setPlayerMark('O');
                break;
            }
            else if(mark == 'X') {
                this.setPlayerMark('X');
                break;
            }
            else {
                System.out.println("Please pick between X and O.\n");
            }
        }  
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

    // Method for players to make a choice - a version especially for Connect-4
    public void placeMarkCol(Board currentBoard) {
        Scanner sc = new Scanner(System.in);
        boolean marked = false;

        while (true) {
            System.out.println("Enter Column [0-" + (currentBoard.getCol()-1) + "]: ");
            int col = sc.nextInt();
            System.out.println();

            for (int i=currentBoard.getRow()-1; i>=0; i--) {
                if (!currentBoard.getCell(i, col).getFilled()) {
                    currentBoard.getCell(i, col).setMark(playerMark);
                    marked = true;
                    break;
                }
            }

            if (marked) {
                break;
            }
            else{
                System.out.println("Oops! This columns has no more space. Please pick another column.");
            }
        }
    }
}