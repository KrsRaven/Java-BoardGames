import java.util.Scanner;

public class RunGame {

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
            else{
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    public static void endGame() {
        Scanner sc = new Scanner(System.in);
        String continueGame = sc.nextLine();

        System.out.println("Would you like to play another game?");

        if (continueGame.toLowerCase() == "y") {
            gameChoice();
        }
        else {
            System.out.println("Thank you for playing. Bye! \n");
        }
    }
}


