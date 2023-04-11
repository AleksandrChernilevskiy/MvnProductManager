package ru.netology.product;

public class Book extends Product {

    private String author;

    public Book(int id, String name, int prise, String author) {
        super(id, name, prise);
        this.author = author;
    }
}
