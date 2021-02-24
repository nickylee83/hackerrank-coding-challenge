package hacker_rank;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String original = A;
		String reverse = "";
		sc.close();

		for (int i = (A.length() - 1); i >= 0; i--) {
			reverse += Character.toString((A.charAt(i)));
		}
		if (original.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
