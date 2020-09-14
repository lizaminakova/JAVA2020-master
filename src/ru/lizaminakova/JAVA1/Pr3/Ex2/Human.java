package ru.lizaminakova.JAVA1.Pr3.Ex2;

public class Human {
    public static void main(String[] args) {
        Human human = new Human();
        Leg leg = new Leg(96, true, 40);
        Hand hand = new Hand(54, "black");
        Head head = new Head(130, "big", "square");
        Body body = new Body(176, 51, "XS");
        System.out.println(body.getHeight()+" "+ leg.getSize()+ " "+ hand.getLength()+ " "+head.getIQ());
    }
}
