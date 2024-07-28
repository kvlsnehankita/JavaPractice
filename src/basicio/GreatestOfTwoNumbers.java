package basicio;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter 1st number");
		int num1 = scanner.nextInt();

		System.out.println("enter 2nd number");
		int num2 = scanner.nextInt();

		scanner.close();

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else if (num2 > num1) {
			System.out.println("num2 is greater than num1");

		} else {
			System.out.println("both numbers are equal");
		}
	}

}
