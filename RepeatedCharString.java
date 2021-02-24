package hacker_rank;

import java.io.*;
import java.util.*;

/* Interview Practice Questions
 * 
 * To find the number of occurrences of a given letter
 * depending on the length to check
 * in a given infinite repeated string  
 */

public class RepeatedCharString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		/*
		 * long counter = 1; int found = 0; long len = s.length(); String temp = ""; int
		 * half = 0;
		 * 
		 * for (int i = 0; i < len; i++) { if (s.charAt(i) == 'a') { found++; } }
		 * 
		 * while (len <= n) { if ((len + len) > n) { temp = s.substring(0, (int) (n -
		 * (len + 1))); System.out.println("len" + len); for (int j = 0; j <
		 * temp.length(); j++) { if (temp.charAt(j) == 'a') { half++; } } } else {
		 * counter++; } len = len + len; } System.out.println(counter); counter = (found
		 * * counter) + half;
		 * 
		 * System.out.println(found); System.out.println(half);
		 * 
		 * return counter;
		 */
		long strLen = s.length();
		long quotient = n / strLen;
		long remainder = n % strLen;
		long counter = 0;

		counter = (getCount(s, strLen) * quotient) + (getCount(s, remainder));
		return counter;
	}

	public static int getCount(String str, long len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();
		System.out.println("Result: " + result);
		scanner.close();
	}
}
