package Deliverables;

import java.util.Scanner;

public class partOneSubmission {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 = 0;
		int hundredsSum = 0;
		int tensSum = 0;
		int onesSum = 0;

		System.out.println("This program will determine if the sum of the ");
		System.out.println("Hundreds, Tens, and Ones values for 2 numbers ");
		System.out.println("are equal to each other.");
		System.out.println();

		// Obtain first number to test
		System.out.print("Enter a number between 100 and 999:");
		int figureOne = sc.nextInt();

		// Confirm first number is between 100 and 999
		if (figureOne > 99 && figureOne < 1000) {
			System.out.println("Thank you!");
			System.out.println();
			System.out.print("Please enter a second number between 100 and 999: ");

		} else {
			System.out.println("Only values between 100 and 999 will be accepted. Please try again.");
		}
		// Obtain second number to test
		int figureTwo = sc.nextInt();

		if (figureTwo > 99 && figureTwo < 1000) {
			System.out.println("Thank you!");
			System.out.println();
			System.out.println("Here are your results.");
			System.out.println();

			// Displays digit in hundreds place for the first number
			hundreds = figureOne / 100;
			System.out.println("Your First Number: " + figureOne);
			System.out.println("  Hundreds Place Digit: " + hundreds);

			// Displays digit in tens place for the first number input
			tens = (figureOne % 100) / 10;
			System.out.println("  Tens Place Digit: " + tens);

			// Display digit in ones place for the first number input
			ones = figureOne % 10;
			System.out.println("  Ones Place Digit: " + ones);
			System.out.println();

			// Displays digit in hundreds place for the second number
			System.out.println("Your Second Number: " + figureTwo);
			hundreds2 = figureTwo / 100;
			System.out.println("  Hundreds Place Digit: " + hundreds2);

			// Displays digit in tens place for the second number
			tens2 = (figureTwo % 100) / 10;
			System.out.println("  Tens Place Digit: " + tens2);

			// Displays digit in ones place for the second number
			ones2 = figureTwo % 10;
			System.out.println("  Ones Place Digit: " + ones2);
			System.out.println();

			// Display sum of digits in hundreds place for the first and second numbers
			hundredsSum = hundreds + hundreds2;
			System.out.println("The sum of the Hundreds digits is: " + hundredsSum);

			// Display sum of digits in tens place for the first and second numbers
			tensSum = tens + tens2;
			System.out.println("The sum of the Tens digits is: " + tensSum);

			// Display sum of digits in ones place for the first and second numbers
			onesSum = ones + ones2;
			System.out.println("The sum of the Ones digits is: " + onesSum);

			System.out.println();
			sc.close();

			if ((hundredsSum == tensSum) && (tensSum == onesSum)) {
				System.out.println("True.");
				System.out.println();
				System.out.println(
						"Congratulations! You've identified 2 numbers that meet the criteria for lab 1 part 1.");
			} else {

				System.out.println("False.");
				System.out.println();
				System.out.println("The sum of the Hundreds, Tens, and Ones digits are not equal.");
			}
		}

		else {
			System.out.println("Only values between 100 and 999 will be accepted.");
			System.out.println("Please try again.");
			System.out.println();
		}

	}

}
