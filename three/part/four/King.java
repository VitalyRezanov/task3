package com.netcracker.tasks.three.part.four;

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
