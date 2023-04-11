package ru.netology.product;

public class Product {
    protected int id;
    protected String name;
    protected int prise;

    public Product(int id, String name, int prise) {
        this.id = id;
        this.name = name;
        this.prise = prise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }
}
