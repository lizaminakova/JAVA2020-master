package ru.lizaminakova.JAVA1.Pr16;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    static ArrayList<Integer> cards1 = new ArrayList<>();
    static ArrayList<Integer> cards2 = new ArrayList<>();
    static int motion = 0;

    public static void start() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите карты первого игрока:");
        String t = scan.nextLine();
        String[] spl = t.split(" ");
        for (int i = 0; i < spl.length; i++) {
            int a = Integer.parseInt(spl[i]);
            cards1.add(a);
        }

        System.out.println("Введите карту второго игрока:");
        t = scan.nextLine();
        spl = t.split(" ");
        for (int i = 0; i < spl.length; i++) {
            int a = Integer.parseInt(spl[i]);
            cards2.add(a);
        }

        while (cards1.size() != 0 && cards2.size() != 0) {
            if (motion == 106) {
                System.out.println("ботва");
                end();
                return;
            }
            motion++;
            round();
        }
        end();
    }

    public static void round() {
        System.out.println("Круг: " + motion);
        System.out.println("\t Первый игрок:" + cards1.get(0) + "\t Второй игрок: " + cards2.get(0));
        if (compare(cards1.get(0), cards2.get(0))) {
            System.out.println("Первый игрок получает карты");
            cards1.add(cards1.get(0));
            cards1.remove(0);
            cards1.add(cards2.get(0));
            cards2.remove(0);

        } else {
            System.out.println("Второй игрок получает карты");
            cards2.add(cards2.get(0));
            cards2.remove(0);
            cards2.add(cards1.get(0));
            cards1.remove(0);
        }
        System.out.println("---------------------------");
    }

    public static boolean compare(int a, int b) {
        if (b == 0 && a == 9) return false;
        if ((a == 0 && b == 9) || a > b) return true;
        return false;
    }

    public static void end() {
        if (cards1.size() == 0)
            System.out.println("\nПобедитель: второй игрок!");
        if (cards2.size() == 0)
            System.out.println("\nПобедитель: первый игрок!");
    }
}
