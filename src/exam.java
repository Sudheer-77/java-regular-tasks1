import java.util.Scanner;
public class exam {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter string value ");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				int count = input.charAt(i) - '0';
				i += 2;
				String st = "";
				while (input.charAt(i) != ']') {
					st += input.charAt(i);
					i++;
				}

				for (int j = 0; j < count; j++) {
					System.out.print(st);
				}
			}
		}

	
	}
}