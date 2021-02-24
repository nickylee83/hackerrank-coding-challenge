package hacker_rank;

//import java.util.*;

public class GenericsTest {

	public static <T extends Comparable<T>> T findMax(T a, T b) {
		int n = a.compareTo(b);
		// if a > b it gives 1, a == b it gives 0, a < b gives -1
		if (n < 0) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(findMax(2, 3)); System.out.println(findMax(3, 3));
		 * System.out.println(findMax(2.0, 3.0)); System.out.println(findMax('a', 'b'));
		 * System.out.println(findMax("Hello", "There"));
		 * System.out.println(findMax("There", "To"));
		 * 
		 */

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] stringArray = { "s1", "s2", "s3", "s4", "s5" };

		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);

		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}

	}

	static class Printer<T> {

		/**
		 * Method Name: printArray Print each element of the generic array on a new
		 * line. Do not return anything.
		 * 
		 * @param A generic array
		 **/
		void printArray(T genArray[]) {
			for (T element : genArray) {
				System.out.println(element);
			}
		}

	}
}
