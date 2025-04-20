package OOP;

import java.util.ArrayList;

public class BoxingNUnboxing {
    public static void main(String[] args) {
        // Boxing and Unboxing
        /* 
            * Boxing in Java is when you convert a 
            primitive data type (like int, double) 
            into an object type (like Integer, Double).

            * Unboxing is when you convert that object 
            back into a primitive.

            In the example below we are adding a primitive
            to the ArrayList even though it is not of type
            object. This is due to 
        */

        int x = 15;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14); // Boxing
        list.add(x);    // Boxing

        /* 
            From the previous wrapper example we saw that
            primitive data cannot be added to the type of
            an ArrayLits<E>, but in this example we added
            14 which is an int (primitive data), so why
            does it work with this example?

            When java sees that you are adding an int to 
            the structure, it knows that an Integer is just
            an int wrapped up as an object, and it will 
            automatically convert the end value into the 
            corresponding Integer object, this is called
            Boxing.
        */
        
        // Boxing: is an automatic conversion from primitive 
        // data to a wrapped object of appropiate type

        int y = list.get(0); // Unboxing: conversion 
                                   // from a wrapped object
                                   // to its corresponding primitive data
        
    }
}
