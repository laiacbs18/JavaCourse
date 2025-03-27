package OOP;

import java.util.Scanner;
import OOP.testingClasses.test1;

public class Packages {
    // Packages
    /*
        Packages are used to group related classes.
        Think of it as a folder in a file directory.
        We use packages to avoid name conflicts,
        and to write a better maintanable code.

        Packages are divided into two categories:
        * Built-in Packages (packages from the Java API)
        * User-defined Packages (create your own packages)
    */

    public static void main(String[] args) {
        /* this is a type of package/library, on line 3 we can see how it is imported  */
        Scanner sc = new Scanner(System.in); // Built-in Package
        sc.close();

        test1 test = new test1(); // User-defined Package
    }
}
