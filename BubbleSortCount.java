package hacker_rank;

import java.util.*;

public class BubbleSortCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();

		// int[] a = new int[n];
		int[] a = { 233, 456, 543, 120, 670, 340, 250 };

		for (int a_i = 0; a_i < a.length; a_i++) {
			// a[a_i] = in.nextInt();
		}
		in.close();

		// Write Your Code Here
		System.out.println("Before sorted!");
		System.out.println(Arrays.toString(a));

		int swapCounter = 0;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					swapCounter++;
				}
			}
			if (swapCounter == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(swapCounter);
	}
}