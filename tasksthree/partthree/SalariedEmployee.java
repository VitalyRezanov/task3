package com.netcracker.tasksthree.partthree;

public class SalariedEmployee extends Employee{
    private double annualSalary;

    public SalariedEmployee(String name, double salary) {
        setName(name);
        annualSalary = salary;
    }

    @Override
    public double weekPay(int hoursWorked) {
        return annualSalary / 52;
    }
}
