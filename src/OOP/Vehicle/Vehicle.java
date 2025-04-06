package OOP.Vehicle;

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
    int modelYear;
    String companyName;

    public Vehicle(int modelYear, String companyName) {
        this.modelYear = modelYear;
        this.companyName = companyName;
    }

    public int calculatePrice(){
        return 10000;
    }

    public void honk(){
        System.out.println("Piiiip, Piiip");
    }
}
