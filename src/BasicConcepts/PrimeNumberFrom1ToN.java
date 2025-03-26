package BasicConcepts;

import java.util.*;

public class PrimeNumberFrom1ToN {
    public static void main(String[] args) {
        // Write a java program to display prime numbers from 1 to n (entered by user)
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wish to find it's prime numbers:");
        int n = input.nextInt();
        int num = 0;
        String primeNumbers = "";

        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
               if(i%num == 0){
                counter ++;
               }
            }

            if(counter == 2){
                primeNumbers = primeNumbers + i + " ";
            }
        }

        input.close();
        System.out.println("Prime Numbers: " + primeNumbers);
    }
}
