class Board {
/*
 * This class is designed for creating a game board constructed 
 * by Cell objects. Methods for checking whether a cell is a valid
 * choice, whether the board is full and for printing the board in the 
 * terminal are in this class.
 */
    private int boardSize;
    private Cell[][] board;
    private int row;
    private int col;
    
    // Build a square game board with a size of [size]x[size]
    public Board (int size) {
        this.boardSize = size;
        this.newBoard(size, size);
        this.row = size;
        this.col = size;
    }

    // Creating a blank new board with numbers of rows and columns as arguments
    public void newBoard (int row, int col) {
        this.board = new Cell[row][col];
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

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
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

    // Check if the board is full
    public boolean isFull() {
        Boolean full = true;

        for (int i=0; i<this.row; i++) {
            for  (int j=0; j<this.col; j++) {
                if (this.getCell(i, j).getFilled() == false) {
                    full = false;
                }
            }
        }
        return full;
    }

    // Printing the board out in the terminal
    public void printBoard() {
        // Print the column numbers
        System.out.print("   ");
        for (int numcol=0; numcol<this.col; numcol++){
            System.out.print(" [" + numcol + "]");
        }
        System.out.println();

        for (int i=0; i<this.row; i++){
            System.out.print("   ");

            // Print the horizontal line for each row
            for (int j=0; j<this.col; j++) {
                System.out.print("+---");
            }
            System.out.print("+"+"\n");
            // Print the row numbers
            System.out.print("[" + i + "]");

            // Print the vertical lines for each column
            for (int k=0; k<this.col; k++) {
                System.out.print("| ");

                // Print the cell content out
                System.out.print(""+ this.getCell(i, k).getMark() + " ");
            }
            System.out.print("|"+"\n");
        }

        // Finish the lower bound of the board
        System.out.print("   ");
        for (int j=0; j<this.col; j++) {
            System.out.print("+---");
        }

        System.out.print("+"+"\n");     
        System.out.println();
    }

}