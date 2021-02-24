package hacker_rank;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		double d = scan.nextDouble();
		// the trick to accept a string after another type of input
		scan.nextLine();
		String s = scan.nextLine();
		
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}