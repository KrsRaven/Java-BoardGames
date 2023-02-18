import java.util.Scanner;

public class RunGame {
    private int gamePlayed;

    public static void startNewGame() {
        Message.welcome();
        gameChoice();
    }

    public static void gameChoice() {
        Message.displayMenu();  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Your choice:");
            int input = sc.nextInt();

            System.out.println();

            if (input == 1) {
                TTT.startGame();
                break;
            }
            else if (input == 2) {
                System.out.println("This game is not available for now. Please make another choice.\n");
            }
            else if (input == 3) {
                System.out.println("Bye!\n");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    public static void endGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to play another game? Press 'Y' for continue, press any other key to exit.");
        String continueGame = sc.nextLine();
        System.out.println();

        if (continueGame.toLowerCase().equals("y")) {
            gameChoice();
        }
        else {
            System.out.println("Thank you for playing. Bye! \n");
        }
    }
}


