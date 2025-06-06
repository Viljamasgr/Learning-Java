package datastructures;

public class lesson35_2d_arrays {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[2][1] = "eggs";

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.println(food + " ");
            }
            System.out.println();
        }
    }
}
