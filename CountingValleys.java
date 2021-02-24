package hacker_rank;
/* Given the steps' path whether going up U or down D
 * we start at ground level = 0 and will end at ground level = 0
 * this is consider we finish one valley
 * count the number of valleys
 * */

public class CountingValleys {

	public static void main(String[] args) {
		String s = "UDDDDUUUUDDDUDUU";
		System.out.println("Valley count = " + countValley(s));
	}

	public static int countValley(String path) {
		// no valley count, on ground level and not going down
		int counter = 0;
		int level = 0;
		boolean down = false;

		// check each char in the given string
		for (int i = 0; i < path.length(); i++) {
			// if it is U, we are going up
			if (path.charAt(i) == 'U') {
				level += 1;
				// if we come up from the valley, and now on the ground, we finish one valley
				if (down == true && level == 0) {
					counter++;
				}
			} else {
				// going down
				level -= 1;
				// below the ground level
				if (level < 0) {
					down = true;
				}
			}
		}
		return counter;
	}

}
