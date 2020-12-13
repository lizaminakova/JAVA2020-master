package ru.lizaminakova.JAVA1.Pr29;

public interface Item {
    int getCost();
    void setCost(int cost);
    String getName();
    void setName(String name);
    Dish getDescription();
    void setDescription(Dish description);
}