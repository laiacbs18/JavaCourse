package OOP;

public class AccessModifiers {
    // Access Modifiers
    /*
        Access modifiers in Java control the visibility and accessibility of classes, 
        methods, and variables. They determine where these elements can be accessed 
        from within the code. There are four main access modifiers:

        1. **public**: The element is accessible from any other class in any package.
        2. **protected**: The element is accessible within its own package and by 
        subclasses (even if they are in different packages).
        3. **default** (no modifier): The element is accessible 
        only within its own package. This is the default level if no modifier is specified.
        4. **private**: The element is accessible only within its own class.

        Using access modifiers helps encapsulate and protect data, 
        promoting better organization and security in your code.
    */

    public static void main(String[] args) {
            MyClass myObj = new MyClass();
            myObj.publicVar = 10; // Accessible
            // myObj.privateVar = 20; // Not accessible, will cause an error
            myObj.protectedVar = 30; // Accessible within the package
            myObj.defaultVar = 40; // Accessible within the package
    
            myObj.display();
    }
}

// Second class example
class MyClass {
    public int publicVar;    // Accessible from anywhere
    private int privateVar;  // Accessible only within MyClass
    protected int protectedVar; // Accessible within the package and subclasses
    int defaultVar;          // Accessible only within the package

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}



