package ru.lizaminakova.JAVA1.Pr7;

public class Chair extends Furniture {
    protected String material;

    public Chair(String colour, int price, String material) {
        super(colour, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
