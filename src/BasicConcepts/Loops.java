package BasicConcepts;

public class Loops {
    public static void main(String[] args) {
        String myFruitList[] = {"apple", "orange", "pear", "pineapple"};

        for (int i = 0; i < myFruitList.length; i++) {
            System.out.println(myFruitList[i]);
        }

        for (String string : myFruitList) {
            System.out.println(string);
        }

        int myCounter1 = 0;
        while (myCounter1 < myFruitList.length) {
            System.out.println(myFruitList[myCounter1]);
            myCounter1 ++;
        }

        int myCounter2 = 0;
        do {
            System.out.println(myFruitList[myCounter2]);
            myCounter2 ++;
        } while (myCounter2 < myFruitList.length);


        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
