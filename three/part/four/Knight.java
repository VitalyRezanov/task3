package com.netcracker.tasks.three.part.four;

import java.util.ArrayList;

public class Knight extends ChessPiece {
    public Knight(String pos) {
        this.setPosition(pos);
    }
    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> stringList = new ArrayList<>();
        char[] coordinate = this.getPosition().toCharArray();
        char x = coordinate[0];
        char y = coordinate[1];
        for (int i = 1, j = 2; i < 3; ++i, --j) {
            stringList.add(Character.toString((char)(x - i)) + (char)(y + j));
            stringList.add(Character.toString((char)(x + i)) + (char)(y + j));
            stringList.add(Character.toString((char)(x - i)) + (char)(y - j));
            stringList.add(Character.toString((char)(x + i)) + (char)(y - j));

        }
        return check(stringList);
    }
}
