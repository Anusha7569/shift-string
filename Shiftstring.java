package shiftstring;

import java.util.Scanner;

public class Shiftstring {

	public static String rotateString(String input, int shiftAmount) {
		// Ensure the shift amount is within the length of the string
		shiftAmount = shiftAmount % input.length();
		int temp = input.length() - shiftAmount;
		String rotatedString = input.substring(temp, input.length()) + input.subSequence(0, temp);
		return rotatedString;
	}

	public static String promptForString(String prompt, String regex, Scanner in) {
		for (;;) {
			System.out.println(prompt);
			String input = in.nextLine();
			if (!input.matches(regex)) {
				System.out.println("Invalid input - try again");
				continue;
			}
			return input;
		}
	}

	public static void main(String[] args) {
		// Create a scanner to read input
		Scanner scanner = new Scanner(System.in);

		// Read the string input
		String inputString = promptForString("Enter a string:", "^[a-zA-Z ]+$", scanner);

		// Read the shift amount (integer)
		int shiftAmount = Integer.parseInt(promptForString("Enter the shift amount:", "^[0-9]+$", scanner));

		// Call the rotateString function and output the result
		String result = rotateString(inputString, shiftAmount);
		System.out.println("Rotated string: " + result);
	}
}
