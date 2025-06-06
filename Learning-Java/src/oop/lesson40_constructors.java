package oop;

public class lesson40_constructors {
    public static void main(String[] args){

        // constructor = A special metho to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student2.age);
        student3.study();
    }
}
