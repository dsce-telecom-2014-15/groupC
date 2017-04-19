package javaprograms;

import java.util.Scanner;

public class OddEvenNumbersPrinter {

	public static void main(String[] args) {
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
			if (y == 1)
				System.out.println("the odd numbers are" + a[i]);
		}
		se.close(); // TODO Auto-generated method stub

	}

}
