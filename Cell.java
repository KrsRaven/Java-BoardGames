class cell {

    private char mark;
    private boolean filled;

    public cell() {
        this.mark = ' ';
        this.filled = false;
    }

    public cell(char mark) {
        this.mark = mark;
        this.filled = true;
    }

    public char getMark() {
        return this.mark;
    }

    public boolean filled() {
        return this.filled;
    }

}