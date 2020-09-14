package ru.lizaminakova.JAVA1.Pr3.Ex3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book ("Rowling", "Harry Potter", 1999, 500);
        System.out.println(book.getAuthor()+" "+book.getDateOfWriting()+ " "+ book.getNumberOfPages()+ " "+book.getName());
    }
}
