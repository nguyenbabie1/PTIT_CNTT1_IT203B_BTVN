package KiemTra45P.ss9.Entity;

public class DigitalProduct extends Product {
    private double weight;
    public DigitalProduct(int id, String name, double price, double weigth) {
        super(id, name, price);
        this.weight = weigth;
    }
    public void displayInfo() {
        System.out.println("Physical Product - id:"+ id + " Name:" + name +"Price:"+ price + "Weight:"+ weight+"kg") ;
    }
}
