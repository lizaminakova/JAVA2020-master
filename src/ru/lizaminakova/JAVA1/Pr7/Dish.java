package ru.lizaminakova.JAVA1.Pr7;

public abstract class Dish {
    protected String colour;

    public Dish(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
