package ru.lizaminakova.JAVA1.Pr23.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Нью-Йорк");
        arr1.add("Вашингтон");
        arr1.add("Чикаго");
        arr1.add("Сан-Франциско");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Москва");
        arr2.add("Тула");
        map.put("США", arr1);
        map.put("Россия", arr2);
        System.out.println(map.get("США"));
        System.out.println(map.get("Россия"));
    }
}
