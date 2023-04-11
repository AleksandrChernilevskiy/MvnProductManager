package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.Product;

public class ProductRepositoryTest {
    ProductRepository repo = new ProductRepository();
    Product product1 = new Product(11, "SamsungS9", 32_000);
    Product product2 = new Product(1, "Гарри Поттер и Тайная Комната", 5_000);
    Product product3 = new Product(30, "SamsungS22", 122_000);
    Product product4 = new Product(2, "Гарри Поттер и Дары смерти", 6_000);


    @BeforeEach
    public void setup() {
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
    }

    @Test

    public void shouldAddProduct() {
        Product[] expected = {product1, product2, product3, product4};
        Product[] actual = repo.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDeleteProduct() {
        repo.removeById(30);

        Product[] expected = {product1, product2, product4};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }
}
