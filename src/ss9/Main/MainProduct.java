package KiemTra45P.ss9.Main;

import KiemTra45P.ss9.Data.ProductFactory;
import KiemTra45P.ss9.Entity.Product;
import KiemTra45P.ss9.Data.ProductDataBase;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDataBase db = ProductDataBase.getInstance();

        while (true) {
            System.out.println("\n=== PRODUCT MANAGEMENT ===");
            System.out.println("1. Add product");
            System.out.println("2. Show all");
            System.out.println("3. Delete product");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter type (1: Physical, 2: Digital): ");
                    int type = sc.nextInt();

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Extra (Weight/Size): ");
                    double extra = sc.nextDouble();

                    Product p = ProductFactory.createProduct(type, id, name, price, extra);
                    db.addProduct(p);
                    break;

                case 2:
                    for (Product prod : db.getAllProducts()) {
                        prod.displayInfo();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    db.deleteProduct(delId);
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}