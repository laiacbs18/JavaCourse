package BasicConcepts;

import java.util.Scanner;

public class Compare2Numbers {
    public static void main(String[] args) {
        //Write a java program that compares 2 numbers entered by user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wish to compare:");
        int firstNum = input.nextInt();
        System.out.println("Please enter a second number you wish to compare:");
        int secondNum = input.nextInt();
        input.close();

        if(firstNum > secondNum){
            System.out.println("" + firstNum + " is greater than " + secondNum);
        }else if(secondNum > firstNum){
            System.out.println("" + secondNum + " is greater than " + firstNum);
        }else{
            System.out.println("" + firstNum + " is equal to " + secondNum);
        }
    }
}
