package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(String position) {
        this.setPosition(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        return this.possibleMove();
    }
}
