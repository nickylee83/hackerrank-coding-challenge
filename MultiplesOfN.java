package hacker_rank;
/* To print multiplication table on a give number
 * 3 x 1 = 3
 * 3 x 2 = 6
 * .........
 * */

import java.util.*;

public class MultiplesOfN {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i < 11; i++) {
			System.out.printf("%1d x %2d" + " = %2d\n", n, i, (n * i));
		}
		scanner.close();
	}
}
