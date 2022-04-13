package com.netcracker.tasksthree.partone;

public class Battery {

    private double capacity;
    private final double originalCapacity;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.originalCapacity = capacity;
    }

    public void drain(double capacity) {
        this.capacity += capacity;
    }

    public void change() {
        this.capacity = originalCapacity;
    }

    public double getRemainingCapacity() {
        return this.capacity;
    }
}
