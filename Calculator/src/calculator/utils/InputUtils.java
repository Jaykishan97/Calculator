package calculator.utils;

import java.util.Scanner;

public class InputUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static double readDouble(String message) {
		System.out.print(message);
		while (!scanner.hasNextDouble()) {
			System.out.print("Invalid input. " + message);
			scanner.nextLine();
		}
		double input = scanner.nextDouble();
		scanner.nextLine();
		return input;
	}
}
