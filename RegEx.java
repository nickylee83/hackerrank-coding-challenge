package hacker_rank;

/* to extract user names (email = gmail.com only)
 * from a database record using regular expression
 * and print out the names in alphabetical order
 * */
import java.util.*;
import java.util.regex.*;

public class RegEx {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		List<String> names = new ArrayList<String>();

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int NItr = 0; NItr < N; NItr++) {
			// split the record into name and email
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			// RegEx: take gamil.com only
			String emailRegEx = "[a-z]+@gmail\\.com$";
			Pattern p = Pattern.compile(emailRegEx);
			Matcher m = p.matcher(emailID);

			// if found, add their names into the list
			if (m.find()) {
				names.add(firstName);
			}
		}

		// sort the list and print it out one by one
		Collections.sort(names);
		for (String s : names) {
			System.out.println(s);
		}

		scanner.close();
	}
}
