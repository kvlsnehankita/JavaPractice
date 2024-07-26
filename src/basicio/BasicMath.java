package basicio;

import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a number:");
		int num = scanner.nextInt();

		float square = num * num;
		System.out.println("suare of the given number:" + square);

		System.out.println("square root of given number:" + Math.sqrt(num));
		System.out.println("log value of given number:"+Math.log(num));

		scanner.close();

	}

}
