package OOP.CircleCompositionExample;

public class CompositionTest {

    // Both are design techniques:
    // inheritance: is used to implement the "is-a" relationship
    // composition: is used to implement the "has-a" relationship
   
    public static void main(String[] args) {
        Point center = new Point(5, 5);
        Circle c1 = new Circle(center, 10);
        System.out.println("Area of the circle: " + c1.CalculateArea());

        /*
            Circle c2 = new Circle(5, 5, 10);
            This is not a professional design since it has redundant code.
        */
    }
}
