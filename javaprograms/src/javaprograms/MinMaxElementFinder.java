package javaprograms;

import java.util.Scanner;

public class MinMaxElementFinder {

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
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];

		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];

		}
		System.out.println("the min value is" + min);
		System.out.println("the min value is" + max);
		se.close();// TODO Auto-generated method stub

	}

}
