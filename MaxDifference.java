package hacker_rank;

import java.util.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// constructor
	Difference(int[] intArray) {
		this.elements = intArray;
		this.maximumDifference = 0;
	}

	void computeDifference() {
		int i = 0;
		int len = this.elements.length;
		int diff = 0;
		
		// first pointer value
		while (i < len) {
			// second pointer value
			for (int j = (i + 1); j < len; j++) {
				// compute difference and take absolute value, compare with max difference
				diff = Math.abs(this.elements[i] - this.elements[j]);
				if (diff >= this.maximumDifference) {
					this.maximumDifference = diff;
				}
			}
			i++;
		}
	}
} // End of Difference class

public class MaxDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
