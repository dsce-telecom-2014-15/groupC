package javaprograms;

import java.util.Scanner;

public class ArrayMerger {

	public static void main(String[] args) {
		// TODO Variables should be named appropropriately to increase
		// readability.
		int array1[], array2[], merged[];
		array1 = new int[5];
		array2 = new int[7];
		merged = new int[12];
		System.out.println("enter the values");
		Scanner se = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			array1[i] = se.nextInt();

		}
		System.out.println("enter the values");
		for (int i = 0; i < 7; i++) {
			array2[i] = se.nextInt();

		}
		for (int j = 0; j < array1.length; j++) {
			merged[j] = array1[j];

		}
		for (int j = 0; j < array2.length; j++) {
			merged[array1.length + j] = array2[j];

		}
		for (int j = 0; j < merged.length; j++) {
			System.out.println(merged[j]);

		} // TODO 3rd array should be created and should store elements of the 2
			// arrays.
			// Print 3rd array.
		se.close(); // TODO Auto-generated method stub

	}

}
