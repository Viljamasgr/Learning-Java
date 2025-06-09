package projects;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class countdown_timer {
    public static void main(String[] args){

        // Java Countdown Timer Program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a message to be displayed at the end: ");
        String message = scanner.nextLine();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if (count < 0){
                    System.out.println(message);
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

        scanner.close();

    }
}

