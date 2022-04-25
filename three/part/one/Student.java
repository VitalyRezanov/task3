package com.netcracker.tasks.three.part.one;

import java.util.Objects;

public class Student {
    String name;
    int totalScore;
    int numberOfQuizzes;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int scope) {
        totalScore += scope;
        ++numberOfQuizzes;
    }

    public int getAverageScope() {
        return totalScore/numberOfQuizzes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", totalScore=" + totalScore +
                ", numberOfQuizzes=" + numberOfQuizzes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return totalScore == student.totalScore && numberOfQuizzes == student.numberOfQuizzes && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalScore, numberOfQuizzes);
    }
}
