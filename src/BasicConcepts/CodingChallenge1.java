package BasicConcepts;

import java.util.Scanner;

public class CodingChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a weight in Kilograms:");
        float weight = input.nextFloat();
        System.out.println("Please enter a height in Meters:");
        float height = input.nextFloat();
        input.close();
        calculateWeightHeight(weight, height);
    }
        
    private static void calculateWeightHeight(float receivedWeight, float receivedHeight) {
       float weight = receivedWeight;
       float height = receivedHeight;
       float bmi = 0;

       if(weight > 0  && height > 0){
            bmi = weight/(height * height);
            System.out.println("BMI = " + bmi + " mg/m2");
       }else{
            System.out.println("Please introduce an amount for both weight and height");
       }

       
    }
}
