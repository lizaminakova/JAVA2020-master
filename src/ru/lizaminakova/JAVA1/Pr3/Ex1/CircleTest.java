package ru.lizaminakova.JAVA1.Pr3.Ex1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println(circle.getRadius());
        circle.setRadius(5);
        double area=Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println(area);
    }
}
