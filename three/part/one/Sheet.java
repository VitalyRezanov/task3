package com.netcracker.tasks.three.part.one;

public class Sheet {
    private String name;
    private int width;
    private int height;
    private int codeSheet;

    public Sheet() {
        name = "A" + codeSheet;
        width = 841;
        height = 1189;
    }

    public void cutInHalf() {
        name = "A" + (++codeSheet);
        int temp = width;
        width = height / 2;
        height = temp;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
