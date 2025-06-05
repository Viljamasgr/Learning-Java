package projects;
import java.util.Scanner;

public class compound_interest_calculator {
    public static void main(String[] args){

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + (rate / 100) / timesCompound, timesCompound * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
