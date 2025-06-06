package projects;
import java.util.Scanner;
import java.util.Random;

public class slot_machine {
    public static void main(String[] args){

        // Java slot machine

        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Display welcome message
        System.out.println("**************************");
        System.out.println("   Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("**************************");

        // Play if balance > 0
        while(balance > 0){

            // Enter bet amount
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            // Verify if bet > balance
            if(bet > balance){
                System.out.println("insufficient funds!");
                continue;
            }
            // Verify if bet > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0;");
            }
            // Subtract bet from balance
            else{
                balance -= bet;
            }

        }

        // Spin row

        // Print row

        // Get payout

        // Ask to play again

        // Display exit message

        scanner.close();
    }

}
