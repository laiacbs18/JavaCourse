package BasicConcepts;

import java.util.Scanner;

public class ArrayExcercises {
    public static void main(String[] args) {
        System.out.println("Please enter 10 values:");
        Scanner input = new Scanner(System.in);
        int[] my_array = new int[10];
        int arrayLength = my_array.length;

        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = input.nextInt();
        }

        /* Sum of Array Elements */
        int sum  = sumOfArrayElements(my_array);
        System.out.println("sum is: " + sum);
        
        /* Average of Array Elements */
        double avr = averageOfArrayElements(sum, arrayLength);
        System.out.println("average is: " + avr);

        System.out.println("Please select a number between 0 to 9 to remove that element from the array: ");
        Boolean verifyInput = false;
        int removingIndex = 0;

        while (!verifyInput) {
            removingIndex = input.nextInt();

            if(removingIndex < 0 || removingIndex > 9){
                System.out.println("Number needs to be between 0 and 9.");
            }else{
                verifyInput = true;
            }
        }

        int[] newArray = removeElementFromArray(my_array, removingIndex);

        for (int i : newArray) {
            System.out.println("New Array: " + i);
        }

        input.close();
    }
                
    private static int sumOfArrayElements(int[] my_array) {
        // Write a java program that allows the user to enter
        // 10 numbers and gives their sum
        int sum = 0;

        for (int i = 0; i < my_array.length; i++) {
            sum = sum + my_array[i];
        }

        return sum;
    }

    private static double averageOfArrayElements(int sum, int arrayLength) {
        // Write a java program that allows the user to enter
        // 10 numbers and gives their average
        double avr = 0d;

        if(sum > 0){
            avr = sum/arrayLength;
        }

        return avr;
    }

    private static int[] removeElementFromArray(int[] my_array, int removingIndex) {
        // Write a java program that removes an element from the Array given a specific index
        int[] newArray = new int[my_array.length - 1];
        int count = 0;

        for (int i = 0; i < my_array.length; i++) {
            if(i != removingIndex){
                newArray[count] = my_array[i];
                if(count < my_array.length -1){
                    count++;
                }
            }
        }

        return newArray;
    }
}
