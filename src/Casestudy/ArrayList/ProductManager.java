package Casestudy.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products = new ArrayList<>();

    // Add product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    // Display all products
    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Find product by Product ID
    public Product findProductById(int productId) {

        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }

    // Remove product by Product ID
    public boolean removeProductById(int productId) {

        Product product = findProductById(productId);

        if (product != null) {
            products.remove(product);
            return true;
        }

        return false;
    }

    // Display products whose price is greater than given amount
    public void displayProductsAbovePrice(double amount) {

        for (Product product : products) {
            if (product.getPrice() > amount) {
                System.out.println(product);
            }
        }
    }
}