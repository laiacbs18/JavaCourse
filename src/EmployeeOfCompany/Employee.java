package EmployeeOfCompany;

// This will be considered the Parent class
public class Employee {
    private int hours = 40;
    private int vacationDays = 10;
    private double salary;

    public Employee(){
        this.salary = 4000.0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

 }
