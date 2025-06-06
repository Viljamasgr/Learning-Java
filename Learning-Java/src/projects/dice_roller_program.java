package projects;
import java.util.Scanner;
import java.util.Random;

public class dice_roller_program {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){

        // Java Dice Roller Program

        // Declare variables
        int numOfDice;
        int total = 0;

        // Get # of dive from the user
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // Check if # of dice > 0
        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                // Roll all the dice
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                // Get the total
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice mut be greater then 0.");
        }
    }
    // Display ASCII of dice
    static void printDie(int roll){

        String dice1 = """
        ╭───────╮
        │       │
        │   ●   │
        │       │
        ╰───────╯
        """;

        String dice2 = """
        ╭───────╮
        │ ●     │
        │       │
        │     ● │
        ╰───────╯
        """;

        String dice3 = """
        ╭───────╮
        │ ●     │
        │   ●   │
        │     ● │
        ╰───────╯
        """;

        String dice4 = """
        ╭───────╮
        │ ●   ● │
        │       │
        │ ●   ● │
        ╰───────╯
        """;

        String dice5 = """
        ╭───────╮
        │ ●   ● │
        │   ●   │
        │ ●   ● │
        ╰───────╯
        """;

        String dice6 = """
        ╭───────╮
        │ ●   ● │
        │ ●   ● │
        │ ●   ● │
        ╰───────╯
        """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }

    }
}
