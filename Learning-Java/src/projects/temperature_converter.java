package projects;
import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {

        // Temperature Converter Program

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double temp;
        double newTemp;
        String unit;

        // Welcome
        System.out.println("Temperature converter program");

        // Prompt user input
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("%.1f%s", newTemp, unit);

        scanner.close();

    }
}
