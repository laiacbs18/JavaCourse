package OOP;

public class Student {
    // Objects
    /*
     * A pen is an object. Its name is Reynolds; color is white,
     * known as its state. It is used to write, so writing is tis behavior.
     * 
     * An object is an instance of a class. A class is a template or
     * blueprint from which objects are created.
     */

    /*
     * When you call a Java class:
     * 
     * The main method is executed.
     * For each instance created, the instance initializer block runs,
     * followed by the constructor.
     * The static initializer block runs (once per class loader).
     * No other methods are automatically run unless explicitly called
     * from the main method or other methods.
     * 
     * public class MyClass {
     * static {
     * System.out.println("Static initializer block");
     * }
     * 
     * {
     * System.out.println("Instance initializer block");
     * }
     * 
     * public MyClass() {
     * System.out.println("Constructor");
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("Main method");
     * MyClass myClass = new MyClass(); // creates an instance
     * }
     * }
     * 
     */

    // States
    /*
     * An object's state refers to the current values of its
     * attributes or properties at a given time. It represents
     * the data that defines the object's characteristics and
     * determines its behavior within a program.
     */
    private String name;
    private int age;
    private String color;
    private char sex; // f or m

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // Behaviours = Methods
    /*
     * Methods are used to perform certain actions,
     * and they are also known as functions.
     * 
     * A Method is a block of code which only runs when it is called.
     * Data can be passed as parameters.
     * 
     * Methods have return types which can be a data type or void.
    */
    public void Eating() {
        System.out.println("Eating");
    }

    public void Drinking() {
        System.out.println("Drinking");
    }

    public void Running() {
        System.out.println("Running");
    }

    public void SayName() {
        System.out.println("My name is " + this.name);
    }

    // Constructor
    /*
     * A constructor is a special method in programming
     * that is automatically called when an object of a
     * class is created. Its primary purpose is to initialize
     * the object's properties or allocate resources.
     * Constructors can take parameters to set initial values
     * and may have default implementations.
     * 
     * In many programming languages, constructors have the same
     * name as the class and do not have a return type.
     * 
     * Note:
     * All Java Classes have an empty constructor class by default.
     */

    // default constructor
    public Student() {
    }

    // full state constructor
    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }
}