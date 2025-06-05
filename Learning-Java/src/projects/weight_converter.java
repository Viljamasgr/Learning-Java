package projects;
import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args){

        // Weight Conversion Program
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for a user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        // Option 1 convert lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        // Options 2 convert kgs to lbs
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        // Else print not a valid choice
        else {
            System.out.println("Invalid Option");
        }
        scanner.close();
    }
}
