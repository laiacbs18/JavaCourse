package OOP.CollectionsExample;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Set
        /* 
            Sets are used to store the unordered set of elements,
            which does not allow us to store duplicate elements.
            
            Sets are divided into: HashSet, LinkedHashSet and TreeSet.

            Set: A collection of unique items (cannot contain
            duplicates).

            HashSet: Stores items quickly using a hash table; 
            no order. Use when you need fast lookups and don't 
            care about order. Uses a has table for storage that places
            elements into specific positions based upon integers called
            hash codes.

            LinkedHashSet: Like HashSet but maintains insertion 
            order. Use when you want uniqueness and remember the 
            order items were added. It's an ordered version of HashSet
            that maintains a doubly-linked List across all elements.
            When the iteration order is needed to be maintained this class
            is used. When iterating through a HashSet the order is unpredictable,
            while a LinkedHashset lets us iterate through the elements in the oder
            in which they were inserted.

            TreeSet: Stores items in sorted order. Use when you 
            need items sorted automatically. This class implements the
            Set interface that uses a binary   tree for storage.
            Like Hashset, Treeset also contains unique elements.
            However, the access and retrieval time of Treeset is quite fast.
            The elements in Treeset are stored in ascending order. 

        */

        Set<String> s1 = new HashSet<>(); // can also be initialiazed as HashSet
                                          // but it's better to leave it with Set
                                          // as it is implementing the hashset interface

        s1.add("element1");
        s1.add("element2");
        s1.add("element2"); // this will not be added because duplicated values are not allowed
        s1.add("element3");

        // Iterating over the collection
        Iterator<String> iterator = s1.iterator();

        System.out.println("HashSet");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Set<String> s2 = new LinkedHashSet<>();
        s2.add("A");
        s2.add("B");
        s2.add("C");
        s2.add("D");
        s2.add("D");
        s2.add("E");

        s2.remove("D");

        Iterator<String> iterator2 = s2.iterator();

        System.out.println("LinkedHashSet");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        Set<String> s3 = new TreeSet<>(); // When printed they'll be in alphabetical order even if added like this
        s3.add("A");
        s3.add("D");
        s3.add("C");
        s3.add("B");
        s3.add("B");

        Iterator<String> iterator3 = s3.iterator();

        System.out.println("TreeSet ");
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
}
