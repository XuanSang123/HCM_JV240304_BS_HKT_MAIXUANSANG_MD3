package Basic.ra.service.impl;

import Basic.ra.model.Product;
import Basic.ra.service.IGenericService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IGenericService<Product, String> {
    private List<Product> products = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(String s) {
        for (Product product : products){
            if (product.getProductId() == s){
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(String s) {
        products.removeIf(product -> product.getProductId().equals(s));
    }
}
