package com.netcracker.tasks.three.part.four;

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
