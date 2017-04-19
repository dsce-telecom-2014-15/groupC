package javaprograms;

import java.util.Scanner;

public class Twoarray {

	public static void main(String[] args) {

		System.out.println("enter the values");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Scanner se = new Scanner(System.in);
				int b = se.nextInt();
				System.out.print(b);
				se.close();
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
