package OOP;

public class Vehicle {
    // Inheritance
    /*
        It allows you to share code between classes
        to reduce redundancy by inheriting attributes
        and method from one class to another. There are
        two categories:
        * subclass (child): the class that inherits from another class
        * supperclass (parent): the class being ingerited from
        To inherit from a class we use the "extends" keyword.

        
    */

    protected String brand = "Ford"; // Vehicle attribute

    public void honk(){
        System.out.println("Piiiip, Piiip");
    }
}
