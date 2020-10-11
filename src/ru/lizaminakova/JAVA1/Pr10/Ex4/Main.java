package ru.lizaminakova.JAVA1.Pr10.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int s = scan.nextInt();
        int b=1;
        for (int i=1; i <=k; i++) {
            b = b*10;
        }
        int a = b/10;
        int l=0;
        int m=0;
        for ( int j=a; j<b; j++) {
            int v=j;
            while (v!=0) {
                l = l + (v % 10);
                v=v/10;
            }
            if (l==s) {
                m++;
            }
            l=0;
        }
        System.out.print(m);
    }
}
