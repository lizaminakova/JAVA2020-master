package ru.lizaminakova.JAVA1.Pr7;

public class Cup extends Dish {
    protected String material;
    protected boolean pattern;

    public Cup(String colour, String material, boolean pattern) {
        super(colour);
        this.material = material;
        this.pattern = pattern;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isPattern() {
        return pattern;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPattern(boolean pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "material='" + material + '\'' +
                ", pattern=" + pattern +
                ", colour='" + colour + '\'' +
                '}';
    }
}
