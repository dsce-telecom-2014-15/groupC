package javaprograms;

import java.util.Scanner;

public class ArrayElementsAdder {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("enter the number");
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();
		System.out.println("enter the values");
		int a[];
		a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = se.nextInt();
			sum = sum + a[i];

		}
		System.out.println("the sum of array elements is" + sum);
		se.close();

		// TODO Auto-generated method stub

	}

}
