package basics;
import java.util.Random;

public class lesson08_random_numbers {
    public static void main(String[] args){

        Random random = new Random();

        int number;
        // setting the range for the random numbers
        number = random.nextInt(1, 6);

        System.out.println(number);

    }
}
