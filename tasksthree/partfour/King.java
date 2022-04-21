package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(String pos) {
        this.setPosition(pos);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        return this.possibleMove();
    }
}
