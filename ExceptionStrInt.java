package hacker_rank;

import java.util.*;

public class ExceptionStrInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();
		int convertedInt = 0;

		try {
			convertedInt = Integer.parseInt(S);
			System.out.println(convertedInt);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}