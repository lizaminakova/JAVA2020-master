package ru.lizaminakova.JAVA1.Pr7;

public class Main {
    public static void main (String[] args) {
        Chair chair1 = new Chair("red", 75, "wood");
        System.out.println(chair1);
        Furniture chair2 = chair1;
        chair2.setColour("yellow");
        System.out.println((Chair)chair2);
        Chair[] chairs = new Chair[2];

        chairs[0] = chair1;
        chairs[1]= (Chair)chair2;
        FurnitureShop shop = new FurnitureShop(chairs) {};
        System.out.println(shop);
    }
}
