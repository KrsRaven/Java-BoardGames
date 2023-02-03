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

    public Cell getCell(int row, int col){
        return this.board[row][col];
    }

    // Check if a position in the board is a valid player choice
    public boolean isValid (int row, int col){
        Boolean valid = true;

        if (row >= this.boardSize || col >= this.boardSize || this.getCell(row, col).getFilled() == true) {
            valid = false;
        }

        return valid;
    }

    // Printing the board out in the terminal
    public void printBoard() {
        for (int i=0; i<this.boardSize; i++){

            // Print the horizontal line for each row
            for (int j=0; j<this.boardSize; j++) {
                System.out.print("+--");
            }
            System.out.print("+"+"\n");

            // Print the vertical lines for each column
            for (int k=0; k<this.boardSize; k++) {
                System.out.print("| ");

                // Print the cell content out
                System.out.print(this.getCell(i, k).getMark());
            }
            System.out.print("|"+"\n");
        }

        // Finish the lower bound of the board
        for (int j=0; j<this.boardSize; j++) {
            System.out.print("+--");
        }

        System.out.print("+"+"\n");     
    }

}