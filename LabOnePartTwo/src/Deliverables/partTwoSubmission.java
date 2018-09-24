package Deliverables;


import java.time.LocalDate; 
import java.time.Period; 
import java.util.Scanner;


public class partTwoSubmission {

	public static void main(String[] args) {

		System.out.println("This program is designed to calcuate the amount of time ");
		System.out.println("between two dates in Years, Months, and Days.");
		System.out.println("");

		// Enter first chronological date
		System.out.print("Enter the earliest date in YYYY-MM-DD format: ");
		Scanner scanner = new Scanner(System.in);
		String earliestDateString = scanner.nextLine();

		LocalDate earliestDate = LocalDate.parse(earliestDateString);

		System.out.println();
		
		// Enter the second date
		System.out.print("Enter the most recent date in YYYY-MM-DD format: ");
		String newestDateString = scanner.nextLine();
		LocalDate newestDate = LocalDate.parse(newestDateString);

		System.out.println();

		Period difference = earliestDate.until(newestDate);

		int days = difference.getDays();
		int months = difference.getMonths();
		int years = difference.getYears();
		scanner.close();

		System.out.println("Your time difference is: " + years + " Years, " + months + " Months, " + days + " Days.");

	}

}
