package controlflow;
import java.util.Scanner;

public class lesson21_while_loops {
    public static void main(String[] args){

        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();
    }
}
