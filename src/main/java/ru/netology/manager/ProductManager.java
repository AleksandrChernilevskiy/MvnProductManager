package ru.netology.manager;

import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {

    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(Product product) {
        repo.save(product);
    }

    public void delete(Product product) {
        repo.removeById(product.getId());
    }

    public Product[] getProducts() {
        Product[] all = repo.getProducts();
        return all;
    }

    public Product[] searchById(String text) {
        Product[] result = new Product[0];
        for (Product product : repo.getProducts()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
