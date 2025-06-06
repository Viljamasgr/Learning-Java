package oop;

public class lesson52_getters_setters {
    public static void main(String[] args){

        // They help protect objects data and rules from accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 100000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
