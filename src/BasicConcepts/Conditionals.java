package BasicConcepts;

public class Conditionals {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;
        int myNum3 = 3;

        if(myNum1 < myNum2){
            System.out.println("Num1 < Num2");
        }else if(myNum3 > myNum2){
            System.out.println("Num3 > Num2");
        }else{
            System.out.println("else");
        }

        switch (myNum1) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
