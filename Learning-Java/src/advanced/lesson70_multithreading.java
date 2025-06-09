package advanced;

public class lesson70_multithreading {
    public static void main(String[] args){


        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background task or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable2("Ping"));
        Thread thread2 = new Thread(new MyRunnable2("Pong"));

        System.out.println("Game start.");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Game stop.");

    }
}
