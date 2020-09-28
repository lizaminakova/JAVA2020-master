package ru.lizaminakova.JAVA1.Pr7;

public class Pug extends Dog {
    protected String size;

    public Pug(int age, String size) {
        super(age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pug{" +
                "size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
}
