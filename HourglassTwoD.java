package hacker_rank;
// -------------------------DONT Control+SHIF+F -------------------------
//-------------------------DONT Control+SHIF+F -------------------------

/* to calculate maximum sum of hour glass in a (6 x 6) 2D array
 * 
 *  a b c    b c h
 *    d        i
 *  e f g    j k l
 * */

public class HourglassTwoD {

	public static void main(String[] args) {
		int hourglassSum = 0;
		// -9 >= array[i][j] <= 9 (Given constraint) [(-9) x 7]
		int maxSum = -63;

		int[][] arr = new int[6][6];

		// print sample array
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = 9;
				System.out.printf("%1d ", arr[row][col]);
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {
				/*        a b c
				 *sum of    d
				 *        e f g
				 * */
				hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				// if max sum < hour glass sum, take hour glass sum
				if (maxSum < hourglassSum) {
					maxSum = hourglassSum;
				}
			}
			// System.out.println();
		}
		System.out.println(maxSum);
	}
}
