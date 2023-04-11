package ru.netology.product;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int prise, String manufacturer) {
        super(id, name, prise);
        this.manufacturer = manufacturer;
    }
}
