package OOP;

public class CollectionsFramework {
    public static void main(String[] args) {
        // Collections Framework
        /* 
            The Java Collection Framework is a set of
            interfaces and classes in the packages java.util
            and java.util.concurrent. They provide client
            programs with various models of how to organize their
            objects, and variuos implementations of each model.

            These models are sometimes called abstract data types,
            and we need them because different programs need different
            ways of organizing their objets.

            Part of the collection are: List, Queue and Set. These also 
            have subclasses.
        */

        // List
        /* 
            Maintains elements in insertion order. May contain duplicate 
            elements. May contain multiple nulls.
        */

        // Queue
        /*
            Holds elements priior to processing. Typically but not 
            necessarily holds elements in FIFO. Two groups of methods:
            one which throw excepion and other either return null or false
            on failure.
        */

        // Set
        /*
            Doesn't allow duplicate elements. May contain at most one null
            element.
        */

        /* 
            A linked list may be better than an array implementation
            of lists for inserting and removing elements from the middle,
            but much worse for random access.

            So choosing the right implementation for your program involves
            knowing how to it will be used as well as what is available.
        */
    }
}
