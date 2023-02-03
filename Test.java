import java.util.Arrays;

public class Test {
    public static void main (String[] args) {
        Board board1 = new Board(3);
        System.out.println(Arrays.deepToString(board1.getBoard()).replace("], ", "]\n"));
        board1.getBoard()[0][0].setMark('X');
        System.out.println(board1.getBoard()[0][0].getFilled());
    }
}
