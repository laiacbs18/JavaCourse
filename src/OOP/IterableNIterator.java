package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableNIterator {
    public static void main(String[] args) {
        // Iterable and Iterators
        /* 
            An iterator is an object that implements 
            the interface Iterator:

            public Iterator<E>{
                boolean hasNext();  // return true if the iteration has more elements
                E next();           // return the next element in the iteration
                void remove();      // remove the last element return by the iterator
            }
            
            The purpose of iterator is to provide a uniform
            way of accessing collection elements sequentially,
            so whatever kind of collection you are dealing with,
            and however it is implemented, you always know how to
            process its elements in turn.

            // coll refers to an object which implements Collection
            // ---Not the preferred idiom from Java 5 on---
            for(Iterator itr = coll.iterator(); itr.asNext();){
                System.out.println(itr.next());
            }

            This code will work with anything that implements the 
            interface Iterable-that is, anything that can produce 
            an Iterator. This is the declaration of Iterable:
            public Iterable<T>{
                Iterator<T> iterator(); // return an iterator over elements of type T
            }

            The foreach statement, can write the preceding code more concisely:
            for(object o : coll){
                System.out.println(o));
            }
            * In Java 5 the Colletion interface was made to extend Iterable,
            so any set, list, or queue can be the target of foreach, as can ararys.
        */

        ArrayList<String> list = new ArrayList<>();
        list.add("Master Coding App");
        list.add("Master Coding Pro App");
        list.add("Master Coding Channel");

        // To Iterate using Iterators
        // Iterator iterator = list.iterator(); it could be use like this,
                                               // but for type safety we should
                                               // specify the type of data
        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // For each
        // can be used with all collections
        for (String string : list) {
            System.out.println(string);
        }
    }
}
