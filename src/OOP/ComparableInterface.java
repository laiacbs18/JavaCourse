package OOP;

import java.util.ArrayList;

public class ComparableInterface{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(20);

        // Comparing elements of ArrayList
        // <E> stands for element
        // <T> stand for type
        
        /* 
            The interface Comparable has one method called compareTo.

            compareTo returns one of the following:
            * a negative number to indicate a less-than relationship 
            * 0 to indicate equality
            * a positive number to indicate a greater-than relationship

            ArrayList implement by default the Comparable interface.
        */
        System.out.println(list.get(0).compareTo(list.get(1)));
    }
}
