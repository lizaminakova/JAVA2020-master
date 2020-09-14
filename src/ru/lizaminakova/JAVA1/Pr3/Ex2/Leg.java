package ru.lizaminakova.JAVA1.Pr3.Ex2;

public class Leg {
    private int length;
    private boolean strong;
    private int size;

    public Leg(int length, boolean strong, int size) {
        this.length = length;
        this.strong = strong;
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public boolean isStrong() {
        return strong;
    }

    public int getSize() {
        return size;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setStrong(boolean strong) {
        this.strong = strong;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
