package ru.lizaminakova.JAVA1.Pr3.Ex2;

public class Hand {
    private int length;
    private String color;

    public Hand(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
