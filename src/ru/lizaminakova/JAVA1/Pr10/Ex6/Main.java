package ru.lizaminakova.JAVA1.Pr10.Ex6;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        recursion(n, n-1);
    }
    static void recursion(int n, int d) {
        if (n%d==0 && d>1) {
            System.out.print( "NO");
        }
        else {
            if (d>1) {
                d--;
                recursion(n, d);
            }
            else {
                System.out.print("YES");
            }
        }
    }
}
