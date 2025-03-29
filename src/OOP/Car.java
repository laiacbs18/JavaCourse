package OOP;

public class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {
        /*  In this example both honk and brand 
            are accessible because they are
            public and protected.

            If brand would have been set to private
            it would not be accesible even if Car is 
            a child from the Vehicle class
        */ 

        // Create a car object
        Car myCar = new Car();

        // Call the honk method, only possible 
        // because we are inheriting from Vehicle
        myCar.honk();

        // Display the value of the brand attribute
        // and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
