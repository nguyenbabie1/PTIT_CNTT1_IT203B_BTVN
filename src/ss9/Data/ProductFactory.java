package KiemTra45P.ss9.Data;

import KiemTra45P.ss9.Entity.DigitalProduct;
import KiemTra45P.ss9.Entity.PhysicalProduct;
import KiemTra45P.ss9.Entity.Product;

public class ProductFactory {

    public static Product createProduct(int type, int id, String name, double price, double extra) {
        switch (type) {
            case 1:
                return new PhysicalProduct(id, name, price, extra);
            case 2:
                return new DigitalProduct(id, name, price, extra);
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}