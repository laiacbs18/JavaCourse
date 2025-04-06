package EmployeeOfCompany;

public class CodeTest {
    public static void main(String[] args) {
        // Creation of objects
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();


        System.out.println("employee working hours: " +employee.getHours());
        System.out.println("employee vacation days: " +employee.getVacationDays());
        System.out.println("lawyer special method: " + lawyer.getLawyerPosition());
        System.out.println("Legal secretary salary: " + legalSecretary.getSalary());
        legalSecretary.sayLegalOath();
        System.out.println("marketer special method: " + marketer.insideMarket());


        System.out.println("The working hours of marketer are: " + marketer.getHours());

        // Objects
        /*
            In this example we see how each class that uses inheritance
            can use methods from the parent class. But another cool thing
            is that in Java all classes implicitly extend from the Object class
            and this is why even if we aren't extending anything we will still
            get results when after our object we add a ".".

            The object class contains methods that are common to all objects.
            
            Example:
            employee.equals(marketer);
            employee.toString();
        */

        // When there is more than one constructor, 
        // different types of objects shapes can be created
        // Example:
        // Lawyer lawyer2 = new Lawyer("Mark");

        /*
            Objects can't be compared using ==
            we use the equals method for that.

            Below is an example of how to compare objects.
        */
        Lawyer lawyer2 = new Lawyer("Mark");
        Lawyer lawyer3 = new Lawyer("Mark");
        Lawyer lawyer4 = lawyer3;

        if(lawyer2.equals(lawyer4)){
            System.out.println("lawyer2.equals(lawyer4)");
        }else if(lawyer3.equals(lawyer4)){
            // Only lawyer3 and layer4 are equel even 
            // if they have the same name as lawyer2
            System.out.println("lawyer3.equals(lawyer4)");
        }

        // Comparing the references of the object
        System.out.println("lawyer2 == lawyer3: " + (lawyer2 == lawyer3));
        System.out.println("lawyer3 == lawyer4: " + (lawyer3 == lawyer4));

        // Comparing the content of the objects
        System.out.println("lawyer2.nameLawyer == lawyer3.nameLawyer: " + (lawyer2.nameLawyer == lawyer3.nameLawyer));
        

        // Polymorphism
        /* 
            Polymorphism is the ability of a single method or 
            function to operate in different ways based on the 
            object it is acting on. It allows methods to be defined 
            in multiple forms, typically through:
            * method overriding (runtime polymorphism) 
            * method overloading (compile-time polymorphism)
            
            This helps in achieving flexibility and reusability in code.

            Polymorphism allows to get the most out of inheritance,
            like in the example below all the objects like lawyer,
            secretary, marketer, etc. are all inheriting from the
            employee class, so all can be added to an array from the
            parent class.

            Even though all sub-classes/sub-objects have different behaviours,
            they can all the same methods.

            The ability to use the same code to be used with several different type
            of object and for the code to behave differently depending on the object
            is what is called Polymorphism.
        */

        Employee[] employees = new Employee[10];
        employees[0] = lawyer;
        employees[1] = secretary;
        employees[2] = marketer;
        employees[3] = legalSecretary;

        Employee employee2 = new Lawyer(); // will behave like a lawyer object even if its of type employee
        Employee employee3 = new Secretary();
        Employee employee4 = new Marketer();
        Employee employee5 = new LegalSecretary();

        // will behave like a marketer object even if its of type employee
        // Only the inherited methods are available, the marketer exclusive
        // methods are not available when used like this unless we use casting
        // this would not be allowed -> employee.insideMarket();
        System.out.println("marketer salary: " + employee4.getSalary()); 

        // accessing special method through casting
        System.out.println("Inside Market: " + ((Marketer)employee4).insideMarket());

        double k = 5; // This is also Polymorphism as we are saving an Integer in a Double

        // Both are design techniques:
        // inheritance: is used to implement the "is-a" relationship
        // composition: is used to implement the "has-a" relationship

        /*
            In our employee example:
            a marketer, a lawyer is an employee,
            therefore that is inheritance.

            a marketer, a lawyer has a salary, 
            therefore that is a composition. 
        */

    }
}
