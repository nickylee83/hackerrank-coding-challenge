package hacker_rank;

import java.util.Arrays;

class Sorting {
	public void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr) {
		int temp = 0;
		int endPos = arr.length - 1;
		int swapPos = 0;

		while (endPos > 0) {

			swapPos = 0;

			for (int i = 0; i < endPos; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapPos = i;
				}
			}
			endPos = swapPos;
		}
		System.out.println(Arrays.toString(arr));
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		int[] myArray = { 1, 4, 7, 2, 8, 1, 4 };
		Sorting s = new Sorting();
		s.printArray(myArray);
		s.sort(myArray);
	}
}
