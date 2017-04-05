package javaprograms;

import java.util.Scanner;

public class MinElementFinder {

	public static void main(String[] args) {
		int a[], min;
		a = new int[5];
		System.out.println("enter the values");
		Scanner se = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = se.nextInt();

		}
		min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];

			}

		}
		System.out.println("minimum element in the array is=" + min);

		se.close();// TODO Auto-generated method stub

	}

}
