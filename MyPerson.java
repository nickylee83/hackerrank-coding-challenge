package hacker_rank;

// import java.io.*;
import java.util.*;

public class MyPerson {
	private int age;

	public MyPerson(int initialAge) {
		// if initial age is negative, show invalid
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
			// else assign initial age to age
		} else {
			age = initialAge;
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old or not
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			MyPerson p = new MyPerson(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
