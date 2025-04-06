package OOP.Vehicle;

public class Car extends Vehicle { // Car is-a Vehicle

    // Inheritance VS Composition Example
    // Car has-an Engine
    Engine engine;

    // Car is-a Vehicle
    /* 
        * Added to the header to extend from parent class, added
        * Created constructor invoking super
    */

    private String modelName = "Mustang"; // Car attribute
    
    // Needed for inheritance
    public Car(int modelYear, String companyName, Engine engine) {
        super(modelYear, companyName);
        this.engine = engine;
    }

    public static void main(String[] args) {
        /*  In this example both honk and brand 
            are accessible because they are
            public and protected.

            If brand would have been set to private
            it would not be accesible even if Car is 
            a child from the Vehicle class
        */ 

        // Create a car object
        int productionYear = 2005;
        String company = "Chevrolet";
        Engine engine1 = new Engine(productionYear, company);
        Car myCar = new Car(productionYear, company, engine1);

        // Call the honk method, only possible 
        // because we are inheriting from Vehicle
        myCar.honk();

        // Display the value of the brand attribute
        // and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);

    }

    public void startCar(){
        System.out.println("Car started");
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 2000;
    }
}
