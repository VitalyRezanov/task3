package com.netcracker.tasksthree.partone;

public class Person {

    private String name;
    private String friends;

    public Person(String name) {
        this.name = name;
        this.friends = "";
    }

    public String getName() {
        return name;
    }

    public String getFriends() {
        return friends;
    }

    public void befriend(Person p) {
        if (this.friends.contains(p.name)) {
            System.out.println("This friend has already been added");
            return;
        }
        this.friends += (p.name + " ");
        p.friends += this.name + " ";
    }

    public void unfriend(Person p) {
        if (this.friends.equals("")) {
            System.out.println("Have no friends");
            return;
        }
        if (this.friends.contains(p.name)) {
            int indexOfBegin = this.friends.indexOf(p.name);
            this.friends = this.friends.substring(0, indexOfBegin) + this.friends.substring(p.name.length() + 1);
            indexOfBegin = p.friends.indexOf(this.name);
            p.friends = p.friends.substring(0, indexOfBegin) + p.friends.substring(this.name.length() + 1);
        }
        else {
            System.out.println("This friend not found");
        }
    }
    public long getFriendCount() {
        return this.friends.chars().filter(ch -> ch == ' ').count();
    }
}