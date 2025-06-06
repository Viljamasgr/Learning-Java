package projects;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args){

        // Rock Paper Scissors Game

        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // Get Choice from user
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice!");
                continue;
            }

            // Get random Choice for the computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer: " + computerChoice);

            // Check win condition
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask to play again?
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // Goodbye Message
        System.out.println("Thanks for playing!");
    }
}
