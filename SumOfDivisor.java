package hacker_rank;

import java.util.*;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculate implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int divSum = 0;
		// no more divisor for one
		if (n == 1) {
			return n;
		}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divSum += i;
			}
		}
		return divSum;
	}
}

class SumOfDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculate();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}