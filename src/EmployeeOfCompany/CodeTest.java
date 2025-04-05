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
    }
}
