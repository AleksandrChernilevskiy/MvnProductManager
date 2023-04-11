package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product product1 = new Product(11, "Samsung S9", 32_000);
    Product product2 = new Product(1, "Гарри Поттер и Тайная Комната", 5_000);
    Product product3 = new Product(30, "Samsung S22", 122_000);
    Product product4 = new Product(2, "Гарри Поттер и Дары смерти", 6_000);


    @BeforeEach
    public void setup() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
    }

    @Test
    public void shouldAddProduct() {
        Product[] expected = {product1, product2, product3, product4};
        Product[] actual = manager.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDeleteProduct() {
        manager.delete(product2);

        Product[] expected = {product1, product3, product4};
        Product[] actual = manager.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchProductById() {

        Product[] expected = {product3};
        Product[] actual = manager.searchById("Samsung S22");

        Assertions.assertArrayEquals(expected, actual);
    }
}
