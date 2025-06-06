package datastructures;
import java.util.Arrays;

public class lesson31_arrays {
    public static void main(String[] args){

        // arrays = a collection of values of the same data type
        //          * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apples", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
