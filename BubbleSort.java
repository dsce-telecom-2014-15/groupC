import java.util.Scanner;

public class BubbleSort {

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
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
			}
		}
		for (int i = 0; i < n; i++) {

			System.out.print(a[i] + " ");
		}
		se.close();

		// TODO Please remove unnecessary comments.
		// TODO Auto-generated method stub

	}

}
