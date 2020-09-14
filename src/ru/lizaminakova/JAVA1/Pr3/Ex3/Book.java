package ru.lizaminakova.JAVA1.Pr3.Ex3;

public class Book {
    private String author;
    private String name;
    private int dateOfWriting;
    private int numberOfPages;

    public Book(String author, String name, int dateOfWriting, int numberOfPages) {
        this.author = author;
        this.name = name;
        this.dateOfWriting = dateOfWriting;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getDateOfWriting() {
        return dateOfWriting;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
