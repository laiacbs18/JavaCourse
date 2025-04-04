package EmployeeOfCompany;

public class Marketer extends Employee{

    public Marketer(){
        setHours(50);
    }

    public boolean insideMarket(){
        return true;
    }

    // Super Keyword
    /*
        A constructor for a child class always starts with an invocation
        of one of the constructors in the parent class. IF the parent clas
        has several constructors then the one which is invoked is determined
        by matching argument lists.
    */

    @Override
    public int getHours(){
        // make it 50 instead of 40
        return super.getHours();
    }
}
