package javaprograms;

import java.util.Scanner;

public class MatrixComparator {

	public static void main(String[] args) {
		int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][2];
		System.out.println("enter the values of array1");
		Scanner se = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				matrix1[i][j] = se.nextInt();

			}

		}
		System.out.println("enter the values of array2");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				matrix2[i][j] = se.nextInt();

			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (matrix1[i][j] == matrix2[i][j])
					continue;
				else
					System.out.println("the matrix are not the same");

			}

		}
		System.out.println("the matrix are the same");

		se.close();
		// TODO Auto-generated method stub

	}

}
