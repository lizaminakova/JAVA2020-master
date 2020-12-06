package ru.lizaminakova.JAVA1.Pr23.Ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Минакова", "Елизавета");
        dictionary.put("Гришкина", "Кристина");
        dictionary.put("Елсукова", "Анастасия");
        dictionary.put("Шевченко", "Владимир");
        dictionary.put("Шорин", "Иван");
        dictionary.put("Лопатка", "Андрей");
        dictionary.put("Бакин", "Илья");
        dictionary.put("Ловкова", "Анастасия");
        dictionary.put("Громов", "Николай");

        Map<String, String> dictionary2 = new HashMap<>();
        for (Iterator<String> iterator = dictionary.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = dictionary.get(key);
            if (!dictionary2.containsValue(value))
                dictionary2.put(key, value);
        }
        System.out.println(dictionary2);
    }
}