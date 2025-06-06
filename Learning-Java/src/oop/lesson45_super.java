package oop;

public class lesson45_super {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         User in constructors and methods override
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        employee.showSalary();

    }
}
