package com.swaptwonumber;

import java.util.Scanner;

public class Swap2NumUsing3rdVariable {

	// Create Method

	public void swapNum() {

		int first, second, third;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Value of x");
		first = scanner.nextInt();

		System.out.println("Enter Value of y");
		second = scanner.nextInt();

		scanner.close();

		System.out.println("Value of Numbers Before Swapping : " + " x = " + first + " , y = " + second);

		third = first;
		first = second;
		second = third;

		System.out.println("Value of Numbers After Swapping : " + " x = " + first + " , y = " + second);

	}

	public static void main(String[] args) {

		// Create an Object
		Swap2NumUsing3rdVariable sVariable = new Swap2NumUsing3rdVariable();

		sVariable.swapNum(); // Call Method By Object

	}

}
