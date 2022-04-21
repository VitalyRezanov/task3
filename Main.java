package com.netcracker;

import com.netcracker.tasksthree.partfour.*;
import com.netcracker.tasksthree.partone.CashRegister;
import com.netcracker.tasksthree.partone.Person;
import com.netcracker.tasksthree.partone.Sheet;
import com.netcracker.tasksthree.partthree.HourlyEmployee;
import com.netcracker.tasksthree.partthree.Manager;
import com.netcracker.tasksthree.partthree.SalariedEmployee;
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
        //**********************************************

        CashRegister register = new CashRegister();

        register.recordPurchase(29.5);
        register.recordPurchase(9.25);
        register.receivePayment(50);

        double change = register.giveChange();

        System.out.println(change);
        System.out.println("Expected: 11.25");
        //*********************************************

        Sheet sheet = new Sheet();
        sheet.cutInHalf();
        System.out.println(sheet.getName());
        System.out.println(sheet.getWidth());
        System.out.println(sheet.getHeight());
        //*************************************************

        StudentTester  studentTester = new StudentTester();
        studentTester.addStudent("Barak");
        studentTester.addStudent("Trump");
        System.out.println(studentTester);

        System.out.println(studentTester.getStudentOfIndex(0));
        System.out.println(studentTester.getStudentOfIndex(1));

        studentTester.getStudentOfName("Trump").addQuiz(2);

        System.out.println(studentTester.getStudentOfName("Trump"));

        //Chess
        ChessPiece king = new King("d1");
        ChessPiece pawn = new Pawn("a2");
        ChessPiece queen = new Queen("d5");
        ChessPiece knight = new Knight("d4");
        System.out.println(king.canMoveTo());
        System.out.println(pawn.canMoveTo());
        System.out.println(queen.canMoveTo());
        System.out.println(knight.canMoveTo());

        //Clock
        Clock clock = new Clock();
        System.out.println(clock.getTime());
        clock.setAlarm(12, 52);
        clock.alarm();

        WorldClock worldClock = new WorldClock(3);
        worldClock.setAlarm(12, 57);
        worldClock.alarm();

        //Employee
        com.netcracker.tasksthree.partthree.Employee[] staff = new com.netcracker.tasksthree.partthree.Employee[3];
        staff[0] = new HourlyEmployee("Morgan", 30);
        staff[1] = new SalariedEmployee("Lin", 52000);
        staff[2] = new Manager("Smith", 10400, 50);

        Scanner in = new Scanner(System.in);

        for(com.netcracker.tasksthree.partthree.Employee e: staff) {
            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = in.nextInt();
            System.out.println("Salary: " + e.weekPay(hours));
        }

    }
}

