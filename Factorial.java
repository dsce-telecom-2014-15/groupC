package javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//TODO 1! = 0! = 1. Check if this program works for these inputs
		int i, fact = 1;
		System.out.println("enter the value of n");
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();
		if (n < 0) {
			System.out.println("invalid input");
		} else if (n == 0) {
			System.out.println("factorial is =" + fact);
		} else {
			for (i = n; i > 1; i--) {
				fact = fact * i;
			}
			System.out.println("factorial is =" + fact);
		}

		se.close();
	}

}
