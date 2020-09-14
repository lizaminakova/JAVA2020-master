package ru.lizaminakova.JAVA1.Pr3.Ex2;

public class Body {
    private int height;
    private int weight;
    private String size;

    public Body(int height, int weight, String size) {
        this.height = height;
        this.weight = weight;
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
