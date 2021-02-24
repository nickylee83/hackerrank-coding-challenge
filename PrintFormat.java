package hacker_rank;

import java.util.Scanner;
/*
* ================================
* java           100 
* cpp            065 
* python         050 
* ================================
 * */

public class PrintFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s" + "%03d%n", s1, x);
		}
		sc.close();
		System.out.println("================================");

	}
}
