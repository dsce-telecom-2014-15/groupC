package javaprograms;

import java.util.Scanner;

public class ArrayElementsAdder {

	public static void main(String[] args) {
		int oddsum = 0, evensum = 0;
		System.out.println("enter the number");
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();
		System.out.println("enter the values");
		int a[];
		a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = se.nextInt();

		}
		for (int i = 0; i < n; i++) {
			int y = a[i] % 2;
			if (y == 1) {
				oddsum = oddsum + a[i];
				System.out.println("the sum of odd numbers are" + oddsum);
			}
		}
		for (int i = 0; i < n; i++) {
			int y = a[i] % 2;
			if (y == 0) {
				evensum = evensum + a[i];
				System.out.println("the sum of odd numbers are" + evensum);
			}
		}
		se.close();

		// TODO Auto-generated method stub

	}

}
