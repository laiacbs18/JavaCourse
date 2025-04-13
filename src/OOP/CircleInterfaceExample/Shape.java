package OOP.CircleInterfaceExample;

public interface Shape {

    /* 
        Java can only inherited (extend) from one super class
        There are other languages that allow to inherit from more
        than one class, but due to certain issues this may bring
        the java designers decided to leave that out.

        Instead Java provides a feature called Interfaces.

        Interfaces are like blueprints for classes. 
        They define a set of methods that a class must implement, 
        but they do not provide the actual code for those methods. 
        Think of an interface as a contract that specifies what 
        actions a class should be able to perform, without dictating 
        how it does so.

        Interfaces are like classes, but they only contain
        headers (methods) without a body.

        Interfaces enable polymorphism, meaning you can use an 
        interface type to refer to objects of any class that 
        implements that interface. This allows for more 
        flexible and reusable code.
    */

    /* 
        Code sharing like this (inheritance) is not useful 
        in this case because each class has a different behavior.
    */

    //              Area         Perimeter
    //Circle:       Pi*R*R       2 * pi * R
    //Rectangle:    L*W          (w + l) * 2
    //Triangle:     h*b/2        a + b + c

    /* 
        As we can see all calculation must be done differently
        depending on the shape of the object and therefore,
        we shouldn't be using inheritance here, as it's not
        making us gain anything from forming that relationship
        among objects.
    */

    /*
        Interface: can only contain method headers
        and class constants.
    */
    public double calculateArea(); //we just declare the header without body
    public double calculatePerimeter(); //all classes that implement the interface must use these methods
}
