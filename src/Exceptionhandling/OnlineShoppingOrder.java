package Exceptionhandling;

import java.util.Scanner;

public class OnlineShoppingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] products = {"Laptop", "Mobile", "Headphones", "Keyboard"};

        try {
            // 1. Accept product price as String
            System.out.print("Enter product price: ");
            String priceString = sc.nextLine();

            // Convert String to double
            double price = Double.parseDouble(priceString);

            // 2. Accept product index
            System.out.print("Enter product index (0-3): ");
            int index = sc.nextInt();

            // Access product
            System.out.println("Selected Product: " + products[index]);

            // 3. Accept quantity
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            // Calculate price / quantity
            double result = price / quantity;

            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per quantity: " + result);

        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid price! Please enter a valid number.");

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index!");

        } 
        catch (ArithmeticException e) {
            System.out.println("Quantity cannot be 0!");

        } 
        finally {
            System.out.println("Order processing completed");
        }

        sc.close();
    }
}