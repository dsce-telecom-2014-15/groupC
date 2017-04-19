package javaprograms;

import java.util.Scanner;

public class MatrixAdder {

	public static void main(String[] args) {
		int[][] matrix1 = new int[2][2];
		int[][] matrix3 = new int[2][2];
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
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println(" ");
		}

		se.close();
		// TODO Auto-generated method stub

	}

}
