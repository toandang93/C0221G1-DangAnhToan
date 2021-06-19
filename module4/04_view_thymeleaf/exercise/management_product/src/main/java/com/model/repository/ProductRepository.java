package com.model.repository;

import com.model.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", 500, "New","Apple"));
        products.put(2, new Product(2, "Oppo", 600, "New","VN"));
        products.put(3, new Product(3, "SamSung", 700, "New","HQ"));
        products.put(4, new Product(4, "XiaoMi", 300, "New","TQ"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public void save(Product product) {
        products.put(product.getId(), product);
    }

    public Product findById(int id) {
        return products.get(id);
    }


    public void update(int id, Product product) {
        products.put(id, product);
    }


    public void remove(int id) {
        products.remove(id);
    }

    public List<Product> search(String name){
        List<Product> newProducts = new ArrayList<>();
        List<Product> productList = findAll();
        boolean check;
        for (Product product : productList){
            check = product.getName().toLowerCase().contains(name.toLowerCase());
            if (check){
                newProducts.add(product);
            }
        }
        return newProducts;
    }
}
