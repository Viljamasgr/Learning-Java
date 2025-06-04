package basics;
import java.util.Scanner;

public class lesson03_user_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are not enrolled as a student");
        }

        scanner.close();
    }
}
