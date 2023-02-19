class Board {
/*
 * This class is designed for creating a game board constructed 
 * by Cell objects. Methods for checking whether a cell is a valid
 * choice, whether the board is full, whether there is a winnder
 *  and for printing the board in the terminal are in this class.
 */
    private int boardSize;
    private Cell[][] board;
    private int row;
    private int col;

    // A default constructor with no arguments, creating a 3x3 board
    public Board () {
        this.newBoard(3 ,3);
        this.row = 3;
        this.col = 3;
        this.boardSize = this.row * this.col;
    }
    
    // Build a square game board with row and column number as arguments
    public Board (int row, int col) {
        this.boardSize = row * col;
        this.newBoard(row, col);
        this.row = row;
        this.col = col;
    }

    // Creating a blank new board with numbers of rows and columns as arguments
    public void newBoard (int row, int col) {
        this.board = new Cell[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
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

    // Check if there is a winner
    public static Boolean isWin(Board board, int rules) {
        Boolean isWin = false;

        // Check row win condition
        for (int i=0; i<board.getRow(); i++) {
            int count = 0;
            char prev = ' ';

            for (int j=0; j<board.getCol(); j++) {
                char trav = board.getCell(i, j).getMark();

                if (prev != ' ' && prev == trav) {
                    count++;
                }
                else {
                    count = 1;
                }
                prev = trav;
                
                if (count >= rules) {
                    isWin = true;
                }
            }
        }

         // Check column win condition
        for (int j=0; j<board.getCol(); j++) {
            int count = 0;
            char prev = ' ';

            for (int i=0; i<board.getRow(); i++) {
                char trav = board.getCell(i, j).getMark();

                if (prev != ' ' && prev == trav) {
                    count++;
                }
                else {
                    count = 1;
                }
                prev = trav;

                if (count >= rules) {
                    isWin = true;
                }
            }
        }

        // Check diagonal win condition
        for (int i=0; i<board.getRow()-1; i++) {

            for (int j=0; j<board.getCol()-1; j++) {
                int count = 0;

                for (int k=0; k<rules; k++) {
                    if (i+k<board.getRow() && j+k<board.getCol()){

                        if (board.getCell(i, j).getMark() != ' ' &&
                        board.getCell(i, j).getMark() == board.getCell(i+k, j+k).getMark()) {
                        count++;
                        }

                        if (count == rules) {
                            isWin = true;
                            break;
                        }
                    }
                        else {
                            break;
                        }
                }
            }
        }

        // Check anti-diagonal win condition
        for (int i=board.getRow()-1; i>=0; i--) {

            for (int j=0; j<board.getCol()-1; j++) {
                int count = 0;

                for (int k=0; k<rules; k++) {
                    if (i-k>=0 && j+k<board.getCol()){

                        if (board.getCell(i, j).getMark() != ' ' &&
                        board.getCell(i, j).getMark() == board.getCell(i-k, j+k).getMark()) {
                        count++;
                        }

                        if (count == rules) {
                            isWin = true;
                            break;
                        }
                    }
                        else {
                            break;
                        }
                }
            }
        }
        return isWin;
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