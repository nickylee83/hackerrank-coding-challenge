package hacker_rank;

/*
 *  Given array size of n. Print even-indexed char + space + odd-indexed char
 */

import java.util.*;

public class PrintEvenOddIndex {

	public static void main(String[] args) {
		int T = 0;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();

		scan.nextLine();

		for (int i = 0; i < T; i++) {
			String S = scan.nextLine();
			int len = S.length();
			String s1 = "";
			String s2 = "";

			for (int j = 0; j < len; j++) {
				if (j % 2 == 0) {
					s1 += S.charAt(j);
				} else {
					s2 += S.charAt(j);
				}
			}
			System.out.println(s1 + " " + s2);
		}
		scan.close();
	}
}