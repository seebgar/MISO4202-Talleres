package main;

import java.util.Scanner;

/**
 * Read a double and echo it with a minimum width of 7 and 3 decimal digits
 * @author sebastian
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		
		System.out.printf("%7.3f\n", d);
		
		sc.close();
		System.exit(0);
	}
}
