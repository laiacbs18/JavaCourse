package OOP;

import OOP.WorkingWithObjects.Student;

// public class NonAccessModifiers extends FinalTest { // cannot subclass a final class
public class NonAccessModifiers {
    /*
        Classes
        There are two types:
        * final: canont be inherited by other classes.
        * abstract: cannot be used to create objects. 
        To access an abstract class ot must be inherited 
        by another class.  

        Attributes and Methods
        * final: cannot be overrideden/modified.
        * abstract: belong to the class, rather than an object.
        * static: methods don't have a body, the body is 
        provided by the subclass (inherited from).
        * volatile
        * transient
        * synchronized
         
         
    */

    public static void main(String[] args) {
        // Example of trying to access abstract class gives an error
        // AbstractTest st = new AbstractTest(); // cannot be instantiated


        // static examples
        Student s2 = new Student();
        System.out.println("Student Id: " + s2.getId());
    }

    // Example of final variable
    final int k = 0;
    final float pi = 3.14f; // is good for declaring constant values

    public final void method1(){
        // k = 10; // cannot assign a new value to final variable
    }

    // abstract example needs to be inside 
    // an abstract class or it gives us an error
    
}
