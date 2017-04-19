package javaprograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		System.out.println("enter the number to be searched");
		Scanner se = new Scanner(System.in);
		int number = se.nextInt();	// Variable should be named appropriately to increase code readability
		for (int i = 0; i < a.length; i++) {
			if (a[i] == number)
				System.out.println("element found in the array");
			else
				System.out.println("element is not present in the array");

		}
		se.close();

		// TODO Auto-generated method stub

	}

}
