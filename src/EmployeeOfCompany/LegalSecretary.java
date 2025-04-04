package EmployeeOfCompany;

public class LegalSecretary extends Secretary{

    public LegalSecretary(){
        setHours(30);
        setSalary(3000.0);
        setVacationDays(15);
    }

    public void sayLegalOath(){
        System.out.println("My Legal Oath");
    }
}
