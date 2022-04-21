package com.netcracker.tasksthree.partthree;

public abstract class Employee {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double weekPay(int hoursWorked);

}
