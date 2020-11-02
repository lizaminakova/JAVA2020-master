package ru.lizaminakova.JAVA1.Pr15;

public class Main {
    public static void main(String[] args) {
        new User("Ricardo", 19);
        new User("Billie", 20);
        new User("Slava", 21);
        new User("Van", 15);


        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("       Всех пользователей: " + User.getUsersCount());
        System.out.println("       Общий возраст всех пользователей: " + User.getAges());
        System.out.println("       Средний возраст всех пользователей: " + User.getAverageAge());
    }
}