package projects;
import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args){

        // Number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        // Prompt user input
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        // Logic
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess < randomNumber){
                System.out.println("Too low! Try again!");
            }
            else if(guess > randomNumber) {
                System.out.println("Too high! Try again!");
            }
            else{
                System.out.println("You win! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}
