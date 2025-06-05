package basics;

public class lesson16_ternary_operator {
    public static void main(String[] args){

        // Ternary operator ? = Return 1 of 2 values if a condition is true

        // Variable = (condition) ? ifTrue : ifFalse;

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
