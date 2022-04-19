package com.netcracker.tasksthree.parttwo;

public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int counter;
    boolean conditionLock;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.conditionLock = true;
    }

    public void reset() {
        counter = 0;
    }

    public void turnLeft(int ticks) {
        if (counter == 1) {
            System.out.println("Turn lock to right");
            return;
        }
        if ((counter == 0 && secret1 != ticks) || (counter == 2 && secret3 != ticks)) {
            conditionLock = false;
        }
        counter++;
    }

    public void turnRight(int ticks) {
        if (counter != 1) {
            System.out.println("Turn lock to left");
            return;
        }
        if (secret2 != ticks) {
            conditionLock = false;
        }
        counter++;
    }

    public boolean open() {
        boolean flag = counter == 3 && conditionLock;
        reset();
        return flag;
    }
}
