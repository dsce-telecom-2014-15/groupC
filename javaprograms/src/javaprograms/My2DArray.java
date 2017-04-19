package javaprograms;

import java.util.Scanner;

public class My2DArray {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		System.out.println("enter the values");
		Scanner se = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				a[i][j] = se.nextInt();

			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}

		se.close();// TODO Auto-generated method stub

	}

}
