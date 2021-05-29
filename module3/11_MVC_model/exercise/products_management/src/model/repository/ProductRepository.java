package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Iphone",800,"Black","Apple"));
        productMap.put(2,new Product(2,"Oppo",600,"White","VN"));
        productMap.put(3,new Product(3,"SamSung",500,"Pink","HQ"));
        productMap.put(4,new Product(4,"XiaoMi",600,"Yellow","TQ"));
        productMap.put(5,new Product(5,"Nokia",300,"Blue","No"));
        productMap.put(6,new Product(6,"IPX",1200,"Red","Apple"));
    }
    public int getMapSize(){
        return productMap.size();
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    public Product findByid(int id) {
        return productMap.get(id);
    }

    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    public void remove(int id) {
        productMap.remove(id);
    }
}
