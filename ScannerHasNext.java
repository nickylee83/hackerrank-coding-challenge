package hacker_rank;

import java.util.*;

public class ScannerHasNext {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String s = "";
		while (scan.hasNext()) {
			s = scan.nextLine();
			i++;
			System.out.println(i + " " + s);
		}
		scan.close();
	}
}