package functions_scope;

public class lesson26_methods {
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        int age = 12;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
