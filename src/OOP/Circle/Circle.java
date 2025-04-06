package OOP.Circle;

public class Circle{
    /*
        Since we have a point which contains x and y,
        we can include the point in this class, using 
        extends Point it would be considered a poor 
        implementation, because the circle does use point
        and a radios, a class should only capture one
        abstraction.

        Circle and point do have a relationship, but a
        circle has a point but is not a point, and a point
        is not a circle. Therefore, the point should be 
        a composition.
    */

    // circle consists of a center(point x,y) and radius
    Point center; // this is how you create a composition
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /*
        This is not a professional design since it has redundant code.
        We should make use of the point class that already exist instead
        of creating additional constructors.
        public Circle(int x, int y, double radius) {
            center = new Point(x, y);
            this.radius = radius;
        }
    */

    // Area of circle
    public double CalculateArea(){
        return Math.PI * radius * radius;
    }

}
