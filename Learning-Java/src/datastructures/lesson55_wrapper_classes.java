package datastructures;

public class lesson55_wrapper_classes {
    public static void main(String[] args){

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitive unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        // Unboxing
        String x = a + b + c + d;

        System.out.println(x);
    }
}
