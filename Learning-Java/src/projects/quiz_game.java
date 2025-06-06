package projects;

import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args){

        // Java Quiz Game

        // Questions array[]
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        // Options array[]
        String[][] options = {{"1. Storing files", "2. Encrypting", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        // Declare variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the Jave Quiz Game!");
        System.out.println("******************************");

        // Question (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //      Options
            for (String option : options[i]){
                System.out.println(option);
            }
            //      Get guess from user
            System.out.print("Enter your guess (1-4): ");
            guess = scanner.nextInt();

            //      Check our guess
            if (guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }
        // Display final score
        System.out.println("Your final score: " + score + " out of: " + questions.length);

        scanner.close();
    }
}
