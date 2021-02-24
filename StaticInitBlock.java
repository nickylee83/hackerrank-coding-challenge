package hacker_rank;

import java.util.*;

public class StaticInitBlock {
	static boolean flag;
	static int B, H;

	static {
		// initialization block
		flag = true;
		B = 0;
		H = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter value for Breadth: ");
		B = scan.nextInt();
		System.out.println("Ënter value for Height: ");
		H = scan.nextInt();
		scan.close();

		if (B < 1 || H < 1) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) throws Exception {

		if (flag) {
			int area = B * H;
			System.out.print("Area: " + area);
		}

	}
}
// end of main
