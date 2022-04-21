package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public class Rook extends ChessPiece{
    public Rook(String position) {
        this.setPosition(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        return this.possibleMove();
    }
}
