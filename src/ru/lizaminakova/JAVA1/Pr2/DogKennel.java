package ru.lizaminakova.JAVA1.Pr2;

public class DogKennel {
    private Dog array[] = new Dog[1000];
    private int SIZE = 0;
    public void plus(Dog ... newDogs) {
        for (int i = 0; i < newDogs.length; i++) {
            array[SIZE] = newDogs[i];
            SIZE++;
        }
        for (int i = 0; i < newDogs.length; i++) {
            System.out.println(array[i]);
        }
    }
}