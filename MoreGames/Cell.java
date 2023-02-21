class Cell {

    /*
     * This class is designed for creating a single cell (a square in the board)
     * as an object. Properties of a celling include the mark inside the cell and 
     * whether it is filled by a player.
     */

    private char mark;
    private boolean filled;
    
    /*  A default constructor initializing a black cell, 
     *  and a constructor creating a cell with the mark as argument
     */
    public Cell() {
        this.mark = ' ';
        this.filled = false;
    }

    public Cell(char mark) {
        this.mark = mark;
        this.filled = true;
    }

    // Accessor methods for getting each cell's content
    public char getMark() {
        return this.mark;
    }

    public boolean getFilled() {
        return this.filled;
    }

    // Change a cell's content
    public void setMark(char mark) {
        this.mark = mark;
        
        if (mark != ' ') {
            this.filled = true;
        }
    }

}