package ru.lizaminakova.JAVA1.Pr14;

import java.util.Comparator;

public class Sort implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return  o1.getGpa()<o2.getGpa()? 1: -1;
    }
}

