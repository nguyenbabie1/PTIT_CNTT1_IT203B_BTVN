package KiemTra45P.ss9.Data;

import KiemTra45P.ss9.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    private static ProductDataBase instance;
    private List<Product> products;
    private ProductDataBase() {
        products = new ArrayList<>();
    }
    public static ProductDataBase getInstance() {
        if (instance == null) {
            instance = new ProductDataBase();
        }
        return instance;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void updateProduct( int id ,Product newProduct) {
        for( int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                products.set(i, newProduct);
                return;
            }
        }
        System.out.println("not found!");

    }
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);

    }
    public List<Product> getAllProducts() {
        return products;
    }
}
