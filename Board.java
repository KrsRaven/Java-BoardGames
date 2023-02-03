class Board {

    private int boardSize;
    private Cell[][] board;
    
    // Build a square game board with a size of [size]x[size]
    public Board (int size) {
        this.boardSize = size;
        this.newBoard(size);
    }

    // Creating a blank new board
    public void newBoard (int size) {
        this.board = new Cell[size][size];
        for (int i=0; i<boardSize; i++) {
            for (int j=0; j<boardSize; j++) {
                this.board[i][j] = new Cell();
            }
        }
    }

    // Accessor methods for getting board and size
    public Cell[][] getBoard() {
        return this.board;
    }

    public int getBoardSize() {
        return this.boardSize;
    }

}