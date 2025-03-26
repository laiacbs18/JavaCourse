package OOP;

public class MethodOverload {
    /*
        Method overloading allows you to create multiple methods 
        with the same name but different parameter lists (type or number 
        of parameters). This enables you to perform similar operations 
        on different types of input.
    */

    public static void main(String[] args) {
        int result1 = sumTwoNumbers(100, 99);
        System.out.println("result1: " + result1);
        double result2 = sumTwoNumbers(1.5, 0.5);
        System.out.println("result2: " + result2);
    }

    public static int sumTwoNumbers(int a, int b) {
        return a + b; // returns an int
    }

    // Method Overloading
    public static double sumTwoNumbers(double a, double b) {
        return a + b; // returns a double
    }
}
