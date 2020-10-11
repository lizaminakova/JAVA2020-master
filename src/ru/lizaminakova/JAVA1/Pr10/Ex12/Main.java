package ru.lizaminakova.JAVA1.Pr10.Ex12;

public class Main {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }
    }
}
