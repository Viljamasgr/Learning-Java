package oop;

public class Car {

    String make;
    String model;
    String color;
    int year;
    double price;
    boolean isRunning = false;

    // Default constructor (for lesson39_oop_basics)
    public Car() {
        this.make = "Ford";
        this.model = "Mustang";
        this.color = "Red";
        this.year = 2025;
        this.price = 58000.99;
    }

    // Parameterized constructor (for lesson42_array_of_objects)
    public Car(String model, String color) {
        this.make = "Ford"; // Default make, or you can allow it to be set
        this.model = model;
        this.color = color;
        this.year = 2025;
        this.price = 58000.99;
    }

    void start() {
        isRunning = true;
        System.out.println("You start the engine.");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine.");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }
}
