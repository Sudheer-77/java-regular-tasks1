package Labtaska;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter string " + i + ": ");
			String str = sc.nextLine();
			Map<Character, Integer> map = new LinkedHashMap<>();
			for (char ch : str.toCharArray()) {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
			System.out.println("Frequency:");
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
			}
			System.out.println();
		}
		sc.close();
	}
}