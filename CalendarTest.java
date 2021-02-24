package hacker_rank;
/*
 * Complete the 'findDay' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER month
 *  2. INTEGER day
 *  3. INTEGER year
 */

import java.time.*;
import java.time.DayOfWeek;
import java.io.*;

class Result {   

	public static String findDay(int month, int day, int year) {
		
		LocalDate localDate = LocalDate.of(year, month, day);

		// Find the day from the local date
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		return dayOfWeek.name();
    }
}

public class CalendarTest {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        /*int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);*/
        int month = 8;
        int day = 05; int year = 2015;

        String res = Result.findDay(month, day, year);
        System.out.println(res);

        /*bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

