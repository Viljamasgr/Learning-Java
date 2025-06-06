package oop;

public class Car extends Vehicle{

    String make;
    String model;
    String color;
    int year;
    double price;
    boolean isRunning = false;

    @Override
    void go(){
        System.out.println("You drive the car.");
    }

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    double getPrice(){
        return this.price;
    }

    // Default constructor (for lesson39_oop_basics)
    public Car() {
        this.make = "Ford";
        this.model = "Mustang";
        this.color = "Red";
        this.year = 2025;
        this.price = 58000.99;
    }

    // Constructor with model and color only (for lesson42_array_of_objects)
    public Car(String model, String color) {
        this.make = "Ford"; // Default make
        this.model = model;
        this.color = color;
        this.year = 2025;
        this.price = 58000.99;
    }

    // Full constructor (for lesson47_toString)
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = 58000.99; // Default price
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

    @Override
    public String toString() {
        return make + " " + model + " (" + year + "), Color: " + color + ", Price: $" + price;
    }
}
