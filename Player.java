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

    // Methods for set player variables
    public void setPlayerMark(char m) {
        this.playerMark = m;
    }

    //
    public void placeMark(Board currentBoard, int col, int row) {
        
    }
}