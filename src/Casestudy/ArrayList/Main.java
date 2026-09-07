package Casestudy.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        // Creating multiple Product objects
        Product p1 = new Product(101, "Laptop", "Electronics", 55000);
        Product p2 = new Product(102, "Mobile", "Electronics", 25000);
        Product p3 = new Product(103, "Chair", "Furniture", 5000);
        Product p4 = new Product(104, "Watch", "Accessories", 8000);

        // Add products
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);

        System.out.println("\n--- All Products ---");
        manager.displayAllProducts();

        // Find product
        System.out.println("\n--- Find Product ---");
        Product product = manager.findProductById(102);

        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }

        // Remove product
        System.out.println("\n--- Remove Product ---");

        if (manager.removeProductById(103)) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }

        // Display remaining products
        System.out.println("\n--- Products After Removal ---");
        manager.displayAllProducts();

        // Products above given price
        System.out.println("\n--- Products Above Rs. 20000 ---");
        manager.displayProductsAbovePrice(20000);
    }
}