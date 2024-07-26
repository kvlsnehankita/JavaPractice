package basicio;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for their name

		System.out.print("Enter your name: ");
		String name = scanner.nextLine(); // Read a line of text

		// Prompt the user for their age
		System.out.print("Enter your age: ");
		int age = scanner.nextInt(); // Read an integer

		// Prompt the user for their height
		System.out.print("Enter your height in meters (e.g., 1.75): ");
		double height = scanner.nextDouble(); // Read a double

		// Close the scanner
		scanner.close();

		// Display the collected information
		System.out.println("Hello, " + name + "!");
		System.out.println("You are " + age + " years old.");
		System.out.println("Your height is " + height + " meters.");
	}
}
