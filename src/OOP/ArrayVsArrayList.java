package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        /* 
            ArrayList class implements the List interface,
            it's based on an array infrastructure.

            ArrayLists are more versatile than arrays, as
            they are resizeable, and have more methods that
            simplify our code's logic.

            In order to use ArrayList we must import it.
        */

        // ArrayList of Strings
        ArrayList<String> myArrayList1 = new ArrayList<>();
        String myStr1 =  "my string";
        myArrayList1.add(myStr1 + "1");
        myArrayList1.add("another string");

        ArrayList<String> myArrayList2 = new ArrayList<>();
        String myStr2 =  "my string";
        myArrayList2.add(myStr2 + "2");
        myArrayList1.addAll(myArrayList2);

        // Adding to a specified position
        myArrayList1.add(2, "Hello");

        System.out.println("myArrayList1: " + myArrayList1);

        // Change an element in ArrayList
        myArrayList1.set(0, "str changed");

        // Remove element from ArrayList
        myArrayList1.remove(2);

        System.out.println("myArrayList1: " + myArrayList1);

        // Iteration over ArrayList
        
        // Using For Loop
        for (int i = 0; i < myArrayList1.size(); i++) {
            System.out.println(myArrayList1.get(i));
        }

        // Using ForEach Loop
        for (String string : myArrayList2) {
            System.out.println(string);
        }

        // Using Iterator Interface
        Iterator<String> iterator = myArrayList1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* 
            * for loop: Use this when you know how many times you want to repeat something. Example: counting from 1 to 10.

            * for-each loop: Use this when you want to go through each item in a collection or array, and you don't need the index. Example: printing all names in a list.

            * Iterator: Use this when you need more control over the collection while looping, such as removing items during iteration.

        */
    }
}