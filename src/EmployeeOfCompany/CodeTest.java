package EmployeeOfCompany;

public class CodeTest {
    public static void main(String[] args) {
        // Creation of objects
        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();


        System.out.println("employee vacation days: " +employee.getVacationDays());
        System.out.println("lawyer special method: " + lawyer.getLawyerPosition());
        System.out.println("Legal secretary salary: " + legalSecretary.getSalary());
        legalSecretary.sayLegalOath();
        System.out.println("marketer special method: " + marketer.insideMarket());

    }
}
