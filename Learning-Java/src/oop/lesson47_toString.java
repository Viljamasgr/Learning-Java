package oop;

public class lesson47_toString {
    public static void main(String[] args){

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representing of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car1);
        System.out.println(car1.color + " " + car1.year + " " + car1.make + " " + car1.model);
    }
}
