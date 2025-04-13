package OOP;

public abstract class AbstractVsInterface {

    /* 
        Abstract classes are declared as abstract.
        They may or may not include abstract 
        methods. Abstract classes cannot be instatiated,
        but they can be subclassed.

        An abstract method is declared without an implementation (body).
        Example: abstract void moveTo(double deltaX, double deltaY);

        Note: If a class includes abstract methods, then the class itself
        must be declared as abstract.
    */

    // Abstract Class VS Interface
    /* 
        Abstract classes are similar to interfaces.
        You cannot instantiate them, and they may
        contain a mix of methods declared with or
        without an implementation.

        In abstract classes you can declare fields
        that are not static and final, and define
        public, protected, and private concrete methods.

        When working with interface, all fields are 
        automatically public, static, and final, and 
        all methods thaht you declare or define 
        (as default methods) are public.

        When to use one or the other?

          Abstract Class                      Interface
        * Share code among sereveal         * Unrelated clases would implement
        related classes.                    your interface.

        * Have many common methods          * Want to specify the behavior of a particular
        or fields, or require access        data type, but not concerned about who implements
        modifiers other than public.        its behavior.

        * Want to be able to declare        * Want to take advantage of multiple inheritance
        non-static or non-final fields.     of type.
    */
}
