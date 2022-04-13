package com.netcracker.tasksthree.partone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTester {

    private List<Student> students;
    private int index = 0;

    public StudentTester() {
        students = new ArrayList<>();
    }

    public Student getStudentOfIndex(int index) {
        return students.get(index);
    }

    private void next() {
        ++index;
    }

    private boolean hasNext() {
        return index<students.size();
    }

    public Student getStudentOfName(String name) {
        index = 0;
        while (this.hasNext()) {
            if (this.students.get(index).getName().equals(name)) {
                break;
            }
            next();
        }
        return this.students.get(index);
    }

    @Override
    public String toString() {
        return "StudentTester{" +
                "students=" + students +
                '}';
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }
}
