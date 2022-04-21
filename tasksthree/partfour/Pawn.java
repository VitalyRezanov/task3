package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
    public Pawn(String position) {
        this.setPosition(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> stringList = new ArrayList<>();
        char[] coordinate = this.getPosition().toCharArray();
        stringList.add(Character.toString((char)(coordinate[0] + 1)) + coordinate[1]);
        return check(stringList);
    }
}
