 package OOP.Vehicle;

public class InheritanceVsComposition {

    // inheritance: is used to implement the "is-a" relationship
    // composition: is used to implement the "has-a" relationship
    public static void main(String[] args) {
        Engine engine = new Engine(2018, "BENZ");
        Car car = new Car(2021, "Mercedes", engine);
        car.startCar();

        //Example of how properties can be accessed through compositions
        System.out.println("Production year: " + car.engine.productionYear);
        System.out.println("Calculated Price: " + car.calculatePrice());
    }
}
