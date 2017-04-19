package javaprograms;

import java.util.Scanner;

public class GcdLcmCalculator {

	public static void main(String[] args) {

		System.out.println("enter the number 1");
		Scanner se = new Scanner(System.in);
		int num1 = se.nextInt();
		System.out.println("enter the number 2");
		int num2 = se.nextInt();
		int x = num1, y = num2;
		while (num2 != 0) {
			int r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		System.out.println("the gcd of two numbers is" + num1);
		int lcm = 1;
		for (int i = x; i <= x * y; i++) {
			if ((i % x == 0) && (i % y == 0)) {
				lcm = i;
				break;

			}

		}
		System.out.println("the lcm of two numbers is" + lcm);

		se.close();
		// TODO Auto-generated method stub

	}

}
