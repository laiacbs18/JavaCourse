package OOP;

    //  Encapsulation
    /* 
        Encapsulation helps protect (hide) the internal state of 
        an object (sensitive data) from unintended interference 
        and misuse by restricting direct access to its fields. 
        Instead, you provide controlled access through methods
        like getters and setters.

        Benefits of Encapsulation:
        * Protects the internal state of an object.
        * Increases code maintainability and flexibility.
        * Allows you to change internal implementation without affecting external code.

    */

    // Getters and Setters
    /*
        Getters (or accessor methods) are used to retrieve the 
        value of a private field. They provide a way to access 
        the data while still keeping it hidden from outside classes.

        Setters (or mutator methods) are used to set or update 
        the value of a private field. They allow you to control 
        how the data is modified.
    */

public class Encapsulation {

}

//Example
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}        