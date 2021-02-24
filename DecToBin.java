package hacker_rank;

import java.util.*;

public class DecToBin {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println(recBinary(n));
		scanner.close();
	}

	public static String recBinary(int num) {
		String bin = "";
		String bNum = "";
		int count = 0;
		int max = 0;
		
		// take the remainder of n divided by 2
		while (num > 0) {
			bin += num % 2;
			num = num / 2;
		}
		
		// because remainders are in reverse order
        // arrange orders of remainders
		for (int i = (bin.length() - 1); i >= 0; i--) {
			bNum += bin.charAt(i);
			// if it is 1, count it, if 0, restart the counter
			if (bin.charAt(i) == '1') {
				count++;
				// if this pair of 1s is greater than the previous pair
				if(count > max) {
					max = count;
				}				
			} else {
				// bNum += bin.charAt(i);
				count = 0;
				
			}
		}
		System.out.println(max);
		return bNum;
	}
}
