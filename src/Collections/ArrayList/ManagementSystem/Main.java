package Collections.ArrayList.ManagementSystem;

public class Main {

    public static void main(String[] args) {

        System.out.println("Product Management System");
        System.out.println("-------------------------");

        // Create ProductManager object
        ProductManager manager = new ProductManager();

        // Create multiple product objects
        Product p1 = new Product(101, "Laptop", "Electronics", 55000);
        Product p2 = new Product(102, "Mobile", "Electronics", 25000);
        Product p3 = new Product(103, "Headphones", "Accessories", 3000);
        Product p4 = new Product(104, "Keyboard", "Accessories", 1500);
        Product p5 = new Product(105, "Monitor", "Electronics", 18000);

        // Add products
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);
        manager.addProduct(p5);

        // Display all products
        System.out.println("\n--- All Products ---");
        manager.displayAllProducts();

        // Find product by ID
        System.out.println("\n--- Find Product ---");
        manager.findProductById(103);

        // Try finding unavailable product
        System.out.println("\n--- Find Product ---");
        manager.findProductById(110);

        // Display products above given price
        System.out.println("\n--- Products Above 20000 ---");
        manager.displayProductsAbovePrice(20000);

        // Remove product
        System.out.println("\n--- Remove Product ---");
        manager.removeProductById(104);

        // Display products after removal
        System.out.println("\n--- Products After Removal ---");
        manager.displayAllProducts();
    }
}