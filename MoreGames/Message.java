public class Message {

    /*
     * This class is designed for display messages that are used in all
     * game. The main reason for creating this class is to make game
     * runners more consise.
     */
    
    public static void welcome() {
        System.out.println("Welcome to the Board Game Center!");
    }

    public static void displayMenu() {
        System.out.println("\nPlease enter the number of the game you want to play, or exit the program.\n");
        System.out.println("1. Tic-Tac-Toe");
        System.out.println("2. Order and Chaos");
        System.out.println("3. Connect-4");
        System.out.println("4. EXIT");
        System.out.println();
    }

    public static void playerChoice(Player player) {
        System.out.println("" + player.getName() + ", ENTER YOUR MOVE");
    }

    public static void congratulation(Player player) {
        System.out.println("Congratulations! "+  player.getName() + " wins!\n");
    }

    public static void drawGame() {
        System.out.println("It's a tie!\n");
    }
    
}
