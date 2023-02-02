class Player {   
    
    private int playerNum;

    public Player(){
        this.playerNum = 0;
    }

    public int otherPlayer() {
        return 1 - playerNum;
    }
}