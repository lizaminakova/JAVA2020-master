package ru.lizaminakova.JAVA1.Pr26.Ex2;

public class Node {
    Object value;
    Node next;
    public Node(Object value, Node next) {
        assert value != null;
        this.value = value;
        this.next = next;
    }
}
