package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public class Bishop extends ChessPiece {
    public Bishop(String position) {
        this.setPosition(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        return this.possibleMove();
    }
}
