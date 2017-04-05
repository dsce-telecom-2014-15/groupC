package javaprograms;

import java.util.Scanner;

public class ArrayMerger {

	public static void main(String[] args) {
		int a[], b[];
		a = new int[5];
		b = new int[7];
		System.out.println("enter the values");
		Scanner se = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = se.nextInt();

		}
		System.out.println("enter the values");
		for (int i = 0; i < 7; i++) {
			b[i] = se.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		se.close(); // TODO Auto-generated method stub

	}

}
