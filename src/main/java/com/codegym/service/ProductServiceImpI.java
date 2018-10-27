package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpI implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "sản phẩm 1", "sản phẩm đẹp","tiến", 500));
        products.put(2, new Product(2, "sản phẩm 2", "sản phẩm đẹp","tiến", 500));
        products.put(3, new Product(3, "sản phẩm 3", "sản phẩm đẹp","tiến", 500));
        products.put(4, new Product(4, "sản phẩm 4", "sản phẩm đẹp","tiến", 500));
        products.put(5, new Product(5, "sản phẩm 1", "sản phẩm đẹp","tiến", 500));
        products.put(6, new Product(6, "sản phẩm 1", "sản phẩm đẹp","tiến", 500));
        products.put(7, new Product(7, "sản phẩm 1", "sản phẩm đẹp","tiến", 500));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
