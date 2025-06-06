package oop;

public class lesson46_method_overriding {
    public static void main(String[] args){

        // Method overriding = When a subclass provides its own
        //                     implementation of a metho that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
