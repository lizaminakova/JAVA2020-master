package ru.lizaminakova.JAVA1.Pr10.Ex13;

public class Main {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
}
