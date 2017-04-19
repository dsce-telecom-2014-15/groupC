package javaprograms;

import java.util.Scanner;

public class Consoleio {

	public static void main(String[] args) {
		System.out.println("enter a int,string,double value");
		Scanner se = new Scanner(System.in);
		int x = se.nextInt();
		String y = se.next();
		double z = se.nextDouble();
		System.out.println(x + "  " + y + "  " + z);
		se.close();// TODO Auto-generated method stub

	}

}
