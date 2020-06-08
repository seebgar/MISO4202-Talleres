package main;

import java.math.BigInteger;

public class Converter {
	public static void main(String[] args) {
		String str = "FF";
		int  X = 16, Y = 10;
		System.out.println(new BigInteger(str, X).toString());
	}
}
