package com.netcracker.tasks.three.part.three;

public class HourlyEmployee extends Employee{
    private double hourlyWage;

    public HourlyEmployee(String name, double wage) {
        this.setName(name);
        this.hourlyWage = wage/40;
    }

    @Override
    public double weekPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40)
        {
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        }
        return pay;
    }
}
