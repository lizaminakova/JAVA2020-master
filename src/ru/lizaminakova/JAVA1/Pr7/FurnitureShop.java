package ru.lizaminakova.JAVA1.Pr7;

import java.util.Arrays;

public class FurnitureShop {
    public Chair[] chairs;
    public FurnitureShop(Chair[] chairs){
        this.chairs = chairs;
    }

    public Chair[] getChairs() {
        return chairs;
    }

    public void setChairs(Chair[] chairs) {
        this.chairs = chairs;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "chairs=" + Arrays.toString(chairs) +
                '}';
    }
}
