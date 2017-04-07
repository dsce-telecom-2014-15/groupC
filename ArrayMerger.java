package javaprograms;

import java.util.Scanner;

public class ArrayMerger {

	public static void main(String[] args) {
		//TODO Variables should be named appropropriately to increase readability. 
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
		//TODO 3rd array should be created and should store elements of the 2 arrays.
		// Print 3rd array.
		se.close(); // TODO Auto-generated method stub

	}

}
