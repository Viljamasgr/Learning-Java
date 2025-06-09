package datastructures;

public class lesson66_generics {
    public static void main(String[] args){

        // Generic = A concept where you can write a class, interface, or method
        //           that is compatible with different data types.
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specifies the type)

        Product<String, Double> product1 = new Product<>("apple", 0.99);
        Product<String, Double> product2 = new Product<>("pineapple", 5.99);

        System.out.println(product1.getItem() + " " + product1.getPrice());
        System.out.println(product2.getItem() + " " + product2.getPrice());

    }
}
