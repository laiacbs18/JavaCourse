package EmployeeOfCompany;

public class Lawyer extends Employee{

    public char getLawyerPosition(){
        return 'm';
    }

    @Override
    public double getSalary(){
        // two ways of doing it returning 4500
        // return 4500;
        return super.getSalary() + 500;
    }
}
