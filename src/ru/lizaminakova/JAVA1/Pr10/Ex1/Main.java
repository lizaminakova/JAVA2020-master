package ru.lizaminakova.JAVA1.Pr10.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            recursion(i,i);
        }
    }
    static void recursion(int n, int k) {
        if (k!=0) {
            System.out.print(n + " ");
            recursion(n, k - 1);
        }
    }
}

