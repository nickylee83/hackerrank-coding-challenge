package hacker_rank;

import java.util.*;

class LoopTwo {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.print("t = ");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.print("a = ");
			int a = in.nextInt();
			System.out.print("b = ");
			int b = in.nextInt();
			System.out.print("n = ");
			int n = in.nextInt();
			int s = a;

			for (int j = 0; j < n; j++) {
				s = s + ((int) (Math.pow(2, j)) * b);
				System.out.print(s + " ");
			}
		}
		in.close();
	}
}
