package BasicConcepts;

public class FactorialNumbers {
    //Write a java program that calculates the factorial of 10
    public static void main(String[] args) {
        int factorial = 1;
        
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of 10 is: " + factorial);
    }
}
