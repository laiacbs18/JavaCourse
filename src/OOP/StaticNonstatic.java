package OOP;

public class StaticNonstatic {
    // Types of variables
    /* 
        * Local variables (non static)
        A variable defined within a block,
        method or constructor is called a local variable.
        k var

        * Instance variables (non static)
        A variable declared in a class outside any method,
        contructor or bloc
        
        * Static variables  (static) - (similar to global variable)
        Static means that a single copy of  the variable is created
        and shared among all objects at a class level.
        Student Id var

        Definition:
        Static Variables: Declared with the static keyword. 
        They belong to the class rather than any specific instance.
        Non-Static Variables: Also known as instance variables, 
        they belong to individual instances of a class.

        Memory Allocation:
        Static Variables: Allocated memory at the class level, 
        shared among all instances of the class.
        Non-Static Variables: Allocated memory for each instance 
        of the class, so each object has its own copy.

        Access:
        Static Variables: Accessed directly through the 
        class name (e.g., ClassName.variableName).
        Non-Static Variables: Accessed through an instance 
        of the class (e.g., objectName.variableName).

        Lifecycle:
        Static Variables: Exist for the duration of the 
        program and are initialized only once.
        Non-Static Variables: Created when an object is 
        instantiated and destroyed when the object is no longer in use.

        In summary, static variables are shared across all 
        instances of a class, while non-static variables are 
        unique to each instance.
    */

    static int k = 0;


    public static void main(String[] args) {
        //example local variable
        int k = 5;

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Student Id: " + s2.getId());
    }
}
