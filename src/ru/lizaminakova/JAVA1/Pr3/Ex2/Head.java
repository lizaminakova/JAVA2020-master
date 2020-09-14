package ru.lizaminakova.JAVA1.Pr3.Ex2;

public class Head {
    private int IQ;
    private String size;
    private String shape;

    public Head(int IQ, String size, String shape) {
        this.IQ = IQ;
        this.size = size;
        this.shape = shape;
    }

    public int getIQ() {
        return IQ;
    }

    public String getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
