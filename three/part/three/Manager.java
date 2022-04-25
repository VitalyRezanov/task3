package com.netcracker.tasks.three.part.three;

public class Manager extends SalariedEmployee{
    private double weeklyBonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.weeklyBonus = bonus;
    }

    @Override
    public double weekPay(int hoursWorked) {
        return super.weekPay(hoursWorked) + weeklyBonus;
    }
}
