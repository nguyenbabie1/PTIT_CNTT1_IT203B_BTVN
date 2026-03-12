package KiemTra45P;

public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(int id, String name, double price, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-10.2f %-10d %-10s",
                id, name, price, quantity, category);
    }
}