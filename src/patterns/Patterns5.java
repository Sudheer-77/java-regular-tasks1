package patterns;

public class Patterns5 {

	public static void main(String[] args) {
		

		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}

			System.out.println(" ");
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j <i; j++) {
				System.out.print(" *");
			}

			System.out.println(" ");
		}
		System.out.println("*************************************");
		// 1. Upper Triangle (Increasing stars, decreasing spaces)
		for (int i = 1; i <= 6; i++) {
		    // Print leading spaces (starts at 5 spaces, decreases to 0)
		    for (int j = 6; j > i; j--) {
		        System.out.print("  "); // Two spaces to match the " *" width
		    }
		    // Print stars
		    for (int k = 0; k < i; k++) {
		        System.out.print(" *");
		    }
		    System.out.println();
		}

		// 2. Lower Triangle (Decreasing stars, increasing spaces)
		for (int i = 5; i >= 1; i--) {
		    // Print leading spaces (starts at 1 space, increases to 5)
		    for (int j = 6; j > i; j--) {
		        System.out.print("  ");
		    }
		    // Print stars
		    for (int k = 0; k < i; k++) {
		        System.out.print(" *");
		    }
		    System.out.println();
		}
	}
}