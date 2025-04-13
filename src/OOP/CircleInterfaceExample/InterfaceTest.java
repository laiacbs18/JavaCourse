package OOP.CircleInterfaceExample;

public class InterfaceTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(15, 10, 7);
        Shape shape2 = new Rectangle(5, 5);
        Shape shape3 = new Triangle(7, 4, 4, 5, 6);


        System.out.println("The area of Circle: " + shape1.calculateArea());
        System.out.println("The area of Rectangle: " + shape2.calculateArea());
        System.out.println("The area of Triangle: " + shape3.calculateArea());
    }
}
