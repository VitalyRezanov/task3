package com.netcracker;

import com.netcracker.tasksthree.partone.CashRegister;
import com.netcracker.tasksthree.partone.Person;
import com.netcracker.tasksthree.partone.Sheet;
import com.netcracker.taskstwo.partthree.Employee;
import com.netcracker.taskstwo.partthree.IntSequence;
import com.netcracker.taskstwo.partthree.Measurable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Barak");
        Person p2 = new Person("Donald");
        Person p3 = new Person("Putin");
        p1.befriend(p2);
        p1.befriend(p3);
        System.out.println(p1.getFriendCount());
        p1.unfriend(p2);
        System.out.println(p1.getFriendCount());

        CashRegister register = new CashRegister();

        register.recordPurchase(29.5);
        register.recordPurchase(9.25);
        register.receivePayment(50);

        double change = register.giveChange();

        System.out.println(change);
        System.out.println("Expected: 11.25");

        Sheet sheet = new Sheet();
        sheet.cutInHalf();
        System.out.println(sheet.getName());
        System.out.println(sheet.getWidth());
        System.out.println(sheet.getHeight());

    }
}

