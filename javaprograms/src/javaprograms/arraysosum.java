package javaprograms;

import java.util.Scanner;

public class arraysosum {

	public static void main(String[] args) {
		int evensum = 0, oddsum = 0;
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
			int y = i % 2;
			if (y == 1) {
				oddsum = oddsum + a[i];
			}
		}
		System.out.println("sum of odd number is" + oddsum);

		for (int i = 0; i < n; i++) {
			int y = i % 2;
			if (y == 0)

				evensum = evensum + a[i];
		}
		System.out.println("sum of even number is" + evensum);
		se.close();
		// TODO Auto-generated method stub

	}

}
