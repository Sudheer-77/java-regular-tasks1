package Collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMissingNumberFromListDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 9, 8, 1, 2, 3, 4, 5, 6);
		int n = 10;
		int expectedNumber = n * (n + 1) / 2;
		int actualNumber = 0;
		for (int i = 0; i < n; i++) {
			actualNumber = actualNumber + i;
		}
		int missingNumber = expectedNumber - actualNumber;
		System.out.println("actualNumber NUmber:" + actualNumber);
		System.out.println("expectedNumber NUmber:" +expectedNumber );
		System.out.println("missing NUmber:" + missingNumber);

	}

}
