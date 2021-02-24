package hacker_rank;

/* 27.01.2020
 * To find two words are anagrams or not. They should not be case-sensitive.
 * 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {

		char[] array_a = new char[a.length()];
		char[] array_b = new char[b.length()];

		// convert lower case and put them into char arrays
		array_a = a.toLowerCase().toCharArray();
		array_b = b.toLowerCase().toCharArray();

		// sort the char arrays
		Arrays.sort(array_a);
		Arrays.sort(array_b);

		// check whether if the sorted char arrays are equals
		if (Arrays.equals(array_a, array_b)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
