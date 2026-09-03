package Collections.ArrayList.ManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    // List interface with ArrayList implementation
    private List<Product> products = new ArrayList<>();

    // Add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    // Display all products
    public void displayAllProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Find product by Product ID
    public void findProductById(int productId) {

        for (Product p : products) {

            if (p.getProductId() == productId) {
                System.out.println("Product Found:");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Product with ID " + productId + " not found.");
    }

    // Remove product by Product ID
    public void removeProductById(int productId) {

        for (Product p : products) {

            if (p.getProductId() == productId) {
                products.remove(p);
                System.out.println("Product removed successfully.");
                return;
            }
        }

        System.out.println("Product with ID " + productId + " not found.");
    }

    // Display products whose price is greater than given amount
    public void displayProductsAbovePrice(double amount) {

        boolean found = false;

        System.out.println("Products with price greater than " + amount + ":");

        for (Product p : products) {

            if (p.getPrice() > amount) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found.");
        }
    }
}