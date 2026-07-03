package poc;

import java.util.Scanner;

public class RestaurantMenu {

	static class OrderNode {
		String name;
		double price;
		int qty;
		OrderNode next;

		OrderNode(String name, double price, int qty) {
			this.name = name;
			this.price = price;
			this.qty = qty;
			this.next = null;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	private static OrderNode cartHead = null;

	public static void main(String[] args) {
		while (true) {
			// Main Menu Layout
			System.out.println("\n--- Main Menu ---");
			System.out.println("1. Veg Biryani");
			System.out.println("2. Chicken Biryani");
			System.out.println("3. Pizza");
			System.out.println("4. Burger");
			System.out.println("5. Exit");

			int mainChoice = getValidatedInput(1, 5);

			if (mainChoice == 5) {
				generateBill();
				break;
			}

			// Sub Menu Loop
			while (true) {
				String selectedName = "";
				double selectedPrice = 0;
				boolean backToMain = false;

				switch (mainChoice) {
				case 1:
					System.out.println("\n--- Veg Biryani ---");
					System.out.println("1. Paneer Biryani – ₹180");
					System.out.println("2. Mushroom Biryani – ₹170");
					System.out.println("3. Veg Dum Biryani – ₹160");
					System.out.println("4. Hyderabadi Veg Biryani – ₹190");
					System.out.println("5. Back to Main Menu");

					int vegChoice = getValidatedInput(1, 5);
					if (vegChoice == 5) {
						backToMain = true;
						break;
					}

					if (vegChoice == 1) {
						selectedName = "Paneer Biryani";
						selectedPrice = 180;
					} else if (vegChoice == 2) {
						selectedName = "Mushroom Biryani";
						selectedPrice = 170;
					} else if (vegChoice == 3) {
						selectedName = "Veg Dum Biryani";
						selectedPrice = 160;
					} else if (vegChoice == 4) {
						selectedName = "Hyderabadi Veg Biryani";
						selectedPrice = 190;
					}
					break;

				case 2:
					System.out.println("\n--- Chicken Biryani ---");
					System.out.println("1. Chicken Dum Biryani – ₹250");
					System.out.println("2. Chicken Fry Piece Biryani – ₹280");
					System.out.println("3. Chicken Boneless Biryani – ₹300");
					System.out.println("4. Chicken Family Pack – ₹700");
					System.out.println("5. Back to Main Menu");

					int chkChoice = getValidatedInput(1, 5);
					if (chkChoice == 5) {
						backToMain = true;
						break;
					}

					if (chkChoice == 1) {
						selectedName = "Chicken Dum Biryani";
						selectedPrice = 250;
					} else if (chkChoice == 2) {
						selectedName = "Chicken Fry Piece Biryani";
						selectedPrice = 280;
					} else if (chkChoice == 3) {
						selectedName = "Chicken Boneless Biryani";
						selectedPrice = 300;
					} else if (chkChoice == 4) {
						selectedName = "Chicken Family Pack";
						selectedPrice = 700;
					}
					break;

				case 3:
					System.out.println("\n--- Pizza ---");
					System.out.println("1. Margherita – ₹250");
					System.out.println("2. Farm House – ₹300");
					System.out.println("3. Cheese Burst – ₹350");
					System.out.println("4. Veg Loaded – ₹320");
					System.out.println("5. Back to Main Menu");

					int pizzaChoice = getValidatedInput(1, 5);
					if (pizzaChoice == 5) {
						backToMain = true;
						break;
					}

					if (pizzaChoice == 1) {
						selectedName = "Margherita";
						selectedPrice = 250;
					} else if (pizzaChoice == 2) {
						selectedName = "Farm House";
						selectedPrice = 300;
					} else if (pizzaChoice == 3) {
						selectedName = "Cheese Burst";
						selectedPrice = 350;
					} else if (pizzaChoice == 4) {
						selectedName = "Veg Loaded";
						selectedPrice = 320;
					}
					break;

				case 4:
					System.out.println("\n--- Burger ---");
					System.out.println("1. Veg Burger – ₹120");
					System.out.println("2. Chicken Burger – ₹180");
					System.out.println("3. Cheese Burger – ₹150");
					System.out.println("4. Crispy Burger – ₹170");
					System.out.println("5. Back to Main Menu");

					int burgerChoice = getValidatedInput(1, 5);
					if (burgerChoice == 5) {
						backToMain = true;
						break;
					}

					if (burgerChoice == 1) {
						selectedName = "Veg Burger";
						selectedPrice = 120;
					} else if (burgerChoice == 2) {
						selectedName = "Chicken Burger";
						selectedPrice = 180;
					} else if (burgerChoice == 3) {
						selectedName = "Cheese Burger";
						selectedPrice = 150;
					} else if (burgerChoice == 4) {
						selectedName = "Crispy Burger";
						selectedPrice = 170;
					}
					break;
				}

				if (backToMain) {
					break;
				}

				System.out.print("Enter quantity for " + selectedName + ": ");
				int qty = getQuantityInput();

				addToCart(selectedName, selectedPrice, qty);

				System.out.println("Added " + qty + " x " + selectedName + " to order.");

				System.out.print("\nOrder more items from this category? (y/n): ");
				String continueInput = scanner.next().trim().toLowerCase();
				if (!continueInput.equals("y")) {
					break;
				}
			}
		}
	}

	private static void addToCart(String name, double price, int qty) {

		if (cartHead == null) {
			cartHead = new OrderNode(name, price, qty);
			return;
		}

		OrderNode temp = cartHead;
		while (temp != null) {
			if (temp.name.equals(name)) {
				temp.qty += qty;
				return;
			}
			if (temp.next == null)
				break;
			temp = temp.next;
		}

		temp.next = new OrderNode(name, price, qty);
	}

	private static int getValidatedInput(int min, int max) {
		while (true) {
			System.out.print("\nEnter choice (" + min + "-" + max + "): ");
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				if (input >= min && input <= max) {
					return input;
				}
				System.out.println("Option out of bounds. Please try again.");
			} else {
				System.out.println("Digits only please.");
				scanner.next();
			}
		}
	}

	private static int getQuantityInput() {
		while (true) {
			if (scanner.hasNextInt()) {
				int qty = scanner.nextInt();
				if (qty > 0)
					return qty;
				System.out.print("Quantity must be greater than 0: ");
			} else {
				System.out.print("Invalid item count. Enter numeric digits: ");
				scanner.next();
			}
		}
	}

	private static void generateBill() {
		if (cartHead == null) {
			System.out.println("\nCart is empty. Exiting store interface.");
			return;
		}

		System.out.println("\n================ FINAL BILL ================");
		System.out.printf("%-30s %-5s %-10s %-10s\n", "Item Name", "Qty", "Price", "Total");
		System.out.println("----------------------------------------------------------");

		double subtotal = 0;
		OrderNode current = cartHead;

		while (current != null) {
			double itemCost = current.price * current.qty;
			subtotal += itemCost;
			System.out.printf("%-30s %-5d ₹%-9.2f ₹%-10.2f\n", current.name, current.qty, current.price, itemCost);
			current = current.next;
		}

		double gst = subtotal * 0.05; // 5% GST
		double totalBill = subtotal + gst;

		System.out.println("----------------------------------------------------------");
		System.out.printf("%-47s ₹%.2f\n", "Subtotal:", subtotal);
		System.out.printf("%-47s ₹%.2f\n", "GST (5%):", gst);
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-47s ₹%.2f\n", "Grand Total:", totalBill);
		System.out.println("==========================================================");
	}
}