import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();
		System.out.println("enter the values");
		int a[];
		a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = se.nextInt();

		}
		int b = n / 2;
		System.out.println("enter the number to be searched");
		int c = se.nextInt();
		for (int i = 0; i < b; i++) {
			if (a[i] == c)
				System.out.println("the number is found");

		}
		for (int i = b; i < n; i++) {
			if (a[i] == c)
				System.out.println("the number is found");

		}
		se.close(); // TODO Auto-generated method stub

	}

}
