package basics;

public class lesson05_arithmetic {
    public static void main(String[] args) {

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;

        System.out.println(z);

        // Augmented Assignment Operators

        int a = 10;
        int b = 3;

        a %= b;
        System.out.println(a);

        // Increment and Decrement Operators

        int c = 1;

        c += 1;
        c++;
        c++;

        c--;
        c--;

        System.out.println(c);

        // Order of operations [P-E-M-D-A-S
    }
}
