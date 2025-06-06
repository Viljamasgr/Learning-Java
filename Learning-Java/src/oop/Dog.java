package oop;

public class Dog extends Animal{

    int lives = 1;

    @Override
    void speak(){
        System.out.println("The dog goes *woof*");
    }

}
