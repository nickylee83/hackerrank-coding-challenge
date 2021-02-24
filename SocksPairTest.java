package hacker_rank;

import java.util.HashSet;

public class SocksPairTest {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		HashSet<Integer> unmatched = new HashSet<Integer>();
		int pairs = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!unmatched.add(arr[i])) {
				unmatched.remove(arr[i]);
				pairs++;
			}
		}
		System.out.println(pairs);
	}

}
