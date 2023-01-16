package com.swaptwonumber;

import java.util.Scanner;

public class Swap2NumWithoutUsing3rdVariable {

	// Create Method

	public void swapNumber() {

		int first, second;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Value of x");
		first = scanner.nextInt();

		System.out.println("Enter Value of y");
		second = scanner.nextInt();

		scanner.close();

		System.out.println("Value of Numbers Before Swapping : " + " x = " + first + " , y = " + second);

		second = second - first;
		first = second + first;
		second = (first - second);

		System.out.println("Value of Numbers After Swapping : " + " x = " + first + " , y = " + second);

	}

	public static void main(String[] args) {

		// Create an Object

		Swap2NumWithoutUsing3rdVariable sWithoutUsing3rdVariable = new Swap2NumWithoutUsing3rdVariable();

		sWithoutUsing3rdVariable.swapNumber(); // Call Method By Object

	}

}
