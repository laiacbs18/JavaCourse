package BasicConcepts;

import java.util.Scanner;

public class SumDigitsConvertNumToStr {
    public static void main(String[] args) {
        // Write a java program that compute the sum of digits of a number
        // example: number: 27 ---> sum of digits: 9

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wish to find it's sum of digits:");
        int inputNum = input.nextInt();
        
        int result = 0;
        int numberToCheck = 1;

        Boolean sumDigitFound = false;

        while (!sumDigitFound) {
            for (int i = 1; i < inputNum; i++) {
                result = numberToCheck + result;
                if(result == inputNum){
                    sumDigitFound = true;
                    break;
                }
            }
            if(numberToCheck < 27 && !sumDigitFound){
                result = 0;
                numberToCheck ++;
            }
        }

        System.out.println("smallest number to sum: " + numberToCheck);


        char charInput[] = String.valueOf(inputNum).toCharArray();  
        int sumDigits = 0;

        for (char currentChar : charInput) {
            sumDigits = sumDigits +  Character.getNumericValue(currentChar);
            System.out.println("Current digit: " + currentChar);
        }

        System.out.println("sumDigits: " + sumDigits);

        int sum = 0;

        while (inputNum != 0) {
            sum = sum + inputNum%10;
            inputNum = inputNum/10;
        }

        input.close();
        System.out.println("sum: " + sum);
    }
}
