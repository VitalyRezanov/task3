package com.netcracker.tasksthree.partfour;

import java.util.ArrayList;

public abstract class ChessPiece {
    private String position;

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public abstract ArrayList<String> canMoveTo();

    protected static ArrayList<String> check(ArrayList<String> array) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.size(); ++i) {
            char[] chars =  array.get(i).toCharArray();
            if (chars[0] < 105 && chars[0] > 96 && chars[1] < 57 && chars[1] > 48) {
                arrayList.add(array.get(i));
            }
        }
        return arrayList;
    }
    protected ArrayList<String> possibleMove() {
        ArrayList<String> stringList = new ArrayList<>();
        char[] coordinate = this.getPosition().toCharArray();
        char x = coordinate[0];
        char y = coordinate[1];
        for (int i = 1; i < 7; ++i) {
            if (!(this instanceof Bishop)) {
                stringList.add(Character.toString((char)(x + i)) + y);
                stringList.add(Character.toString((char)(x - i)) + y);
                stringList.add(Character.toString(x) + (char)(y + i));
                stringList.add(Character.toString(x) + (char)(y - i));
            }
            if (!(this instanceof Rook)) {
                stringList.add(Character.toString((char)(x + i)) + (char)(y + i));
                stringList.add(Character.toString((char)(x - i)) + (char)(y - i));
                stringList.add(Character.toString((char)(x - i)) + (char)(y + i));
                stringList.add(Character.toString((char)(x + i)) + (char)(y - i));
            }
            if (this instanceof King) {
                break;
            }
        }
        return check(stringList);
    }
}
