package basicio;

import java.util.Scanner;

public class SwppingWithoutIntermiate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter 1st number");
		int num1 = scanner.nextInt();

		System.out.println("enter 2nd number");
		int num2 = scanner.nextInt();

		scanner.close();
		System.out.println("Before swapping:");
		System.out.println("num1 is:" + num1); 
		System.out.println("num2 is:" + num2); 
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		/*num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;*/
		
		System.out.println("After swapping:");
		System.out.println("num1 is:" + num1); 
		System.out.println("num2 is:" + num2); 
		
		
		
		
		
				
		
		
		

	}
}
