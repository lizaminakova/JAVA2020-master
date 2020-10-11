package ru.lizaminakova.JAVA1.Pr10.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        recursion(N,0);
    }
    static void recursion(int N, int s) {
        if (N!=0) {
            s=s+N%10;
            N=N/10;
            recursion(N,s);
        }
        else {
            System.out.print(s);
        }
    }
}
