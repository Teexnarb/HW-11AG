package org.example;

public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Стивен", "Кинг");
        Book it = new Book("Оно", stephenKing, 1986);
        System.out.println("it.title = " + it.getTitle());
        System.out.println("it.author = " + it.getAuthor());
        System.out.println("it.yearOfPublication = " + it.getYearOfPublication());
        it.setYearOfPublication(1990);
        System.out.println("it.getYearOfPublication = " + it.getYearOfPublication());
    }
}
