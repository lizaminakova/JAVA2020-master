package ru.lizaminakova.JAVA1.Pr7;

public abstract class Furniture {
    protected String colour;
    protected int price;

    public Furniture(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
