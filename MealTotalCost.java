package hacker_rank;

import java.util.*;

/* To calculate meal total cost (round decimal points) => meal + tips percentage + tax percentage */

public class MealTotalCost {

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		// tip percentage on the meal
		double tip = (tip_percent / 100.0) * meal_cost;
		// tax percentage on the meal
		double tax = (tax_percent / 100.0) * meal_cost;

		double total_cost = meal_cost + tip + tax;
		// round the total cost
		System.out.println(Math.round(total_cost));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();
	}
}
