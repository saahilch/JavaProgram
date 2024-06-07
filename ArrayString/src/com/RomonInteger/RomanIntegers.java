package com.RomonInteger;

import java.util.Scanner;

public class RomanIntegers {

	// TODO Auto-generated method stub
	public String intToRoman(int num) {
		final String[] M = { "", "M", "MM", "MMM" };
		final String[] C = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		final String[] X = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		final String[] I = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		if (num < 1 || num > 3999) {
			return "Invalid String Please Enter An Integer Between 1 & 3999";
		}
		return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer(1-3999)");
		while (!sc.hasNext()) {
			System.out.println("Invalid input.Please enter Valid integr");
			sc.next();
		}
		int num = sc.nextInt();
		RomanIntegers solution = new RomanIntegers();
		String romanNumaral = solution.intToRoman(num);
		System.out.println("Roman Numerals " + romanNumaral);
		sc.close();
	}

}
