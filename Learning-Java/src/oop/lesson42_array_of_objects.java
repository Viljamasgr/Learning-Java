package oop;

public class lesson42_array_of_objects {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")
        };

        for (Car car : cars) {
            car.color = "Black";
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}
