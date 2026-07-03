package ConditionalStatements;
import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mainChoice;
        int itemChoice;
        double totalBill = 0;
        char ch;

        do {
            System.out.println("\n===== DSK SUPERMARKET =====");
            System.out.println("1. Vegetables");
            System.out.println("2. Fruits");
            System.out.println("3. Food Items");
            System.out.println("4. Non-Veg");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {

                case 1:
                    do {
                        System.out.println("\n--- VEGETABLES ---");
                        System.out.println("1. Tomato - Rs 30");
                        System.out.println("2. Potato - Rs 40");
                        System.out.println("3. Onion - Rs 50");
                        System.out.print("Select Item: ");
                        itemChoice = sc.nextInt();

                        switch (itemChoice) {
                            case 1:
                                totalBill += 30;
                                System.out.println("Tomato Added");
                                break;

                            case 2:
                                totalBill += 40;
                                System.out.println("Potato Added");
                                break;

                            case 3:
                                totalBill += 50;
                                System.out.println("Onion Added");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        System.out.print("Continue in Vegetables? (Y/N): ");
                        ch = sc.next().charAt(0);

                    } while (ch == 'Y' || ch == 'y');
                    break;

                case 2:
                    do {
                        System.out.println("\n--- FRUITS ---");
                        System.out.println("1. Apple - Rs 100");
                        System.out.println("2. Banana - Rs 60");
                        System.out.println("3. Orange - Rs 80");
                        System.out.print("Select Item: ");
                        itemChoice = sc.nextInt();

                        switch (itemChoice) {
                            case 1:
                                totalBill += 100;
                                System.out.println("Apple Added");
                                break;

                            case 2:
                                totalBill += 60;
                                System.out.println("Banana Added");
                                break;

                            case 3:
                                totalBill += 80;
                                System.out.println("Orange Added");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        System.out.print("Continue in Fruits? (Y/N): ");
                        ch = sc.next().charAt(0);

                    } while (ch == 'Y' || ch == 'y');
                    break;

                case 3:
                    do {
                        System.out.println("\n--- FOOD ITEMS ---");
                        System.out.println("1. Rice - Rs 70");
                        System.out.println("2. Biscuits - Rs 20");
                        System.out.println("3. Noodles - Rs 40");
                        System.out.print("Select Item: ");
                        itemChoice = sc.nextInt();

                        switch (itemChoice) {
                            case 1:
                                totalBill += 70;
                                System.out.println("Rice Added");
                                break;

                            case 2:
                                totalBill += 20;
                                System.out.println("Biscuits Added");
                                break;

                            case 3:
                                totalBill += 40;
                                System.out.println("Noodles Added");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        System.out.print("Continue in Food Items? (Y/N): ");
                        ch = sc.next().charAt(0);

                    } while (ch == 'Y' || ch == 'y');
                    break;

                case 4:
                    do {
                        System.out.println("\n--- NON-VEG ---");
                        System.out.println("1. Chicken - Rs 250");
                        System.out.println("2. Mutton - Rs 600");
                        System.out.println("3. Fish - Rs 300");
                        System.out.print("Select Item: ");
                        itemChoice = sc.nextInt();

                        switch (itemChoice) {
                            case 1:
                                totalBill += 250;
                                System.out.println("Chicken Added");
                                break;

                            case 2:
                                totalBill += 600;
                                System.out.println("Mutton Added");
                                break;

                            case 3:
                                totalBill += 300;
                                System.out.println("Fish Added");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        System.out.print("Continue in Non-Veg? (Y/N): ");
                        ch = sc.next().charAt(0);

                    } while (ch == 'Y' || ch == 'y');
                    break;

                case 5:
                    System.out.println("\nThank You for Shopping!");
                    break;

                default:
                    System.out.println("Invalid Main Menu Choice");
            }

        } while (mainChoice != 5);

        System.out.println("\n========================");
        System.out.println("TOTAL BILL = Rs " + totalBill);
        System.out.println("========================");

        sc.close();
    }
}