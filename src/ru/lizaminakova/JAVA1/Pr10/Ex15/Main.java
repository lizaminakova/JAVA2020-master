package ru.lizaminakova.JAVA1.Pr10.Ex15;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(321));
    }

    public static int recursion(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
}
