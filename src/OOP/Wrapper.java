package OOP;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        // The <E> in ArrayList can be filled with any
        // object as long as it isn't a primitive type
        // Ex: ArrayList<E> objectArray = new ArrayList<>();

        //How to solve this problem?
        /* 
            Since we can't use primitives, but we might need to
            the solution is a Wrapper class.

            A wrapper class is a class that "wraps" (stores)
            primitive data as an object. Primitive types are
            not objects.
        */

        int x = 15;

        // Integer will be te wrapper class, since it has been marked for removal
        // this would not be allowed inside the ArrayList int x = 15 without a wrapper
        // the wrapper class will be used instead.
        // Integer y = new Integer(15); This is deprecated, so we will use
        // Integer.valueOf(x) instead
        Integer y = Integer.valueOf(x);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(y);
        list.add(Integer.valueOf(200));

        System.out.println(list);

        /* 
            Wrapper classes are used to group multiple data items 
            (like variables) into a single object.

            When to use them:
                * When you want to pass around multiple 
                related data items together.
                * When you need to customize or extend 
                data handling, such as adding extra info or methods.
                * When working with collections like 
                lists or maps that need complex data structures.

            Why use them:
                * To organize data more clearly.
                * To simplify code by working with one object 
                instead of many separate variables.
                * To add extra functionality or logic to your data.

            Use a wrapper class when you want to handle multiple 
            pieces of data as one, making your code cleaner and more flexible.
        */
    }
}
