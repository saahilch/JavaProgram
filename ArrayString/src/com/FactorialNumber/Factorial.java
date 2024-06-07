
/*
 * 1-Take Number from user 
 * 2-declare two big integers & assign vaue as 1 cz 1 fact us also one
 * 3-initilise for & traverse till the number is greter than user number
 * 4-multiply the numbers in for loop then add it in the same loop
 * 5-print */
package com.FactorialNumber;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Get Factorial");
		int number = sc.nextInt();
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		for (int i = 1; i <= number; i++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println(number + "!=" + fact);
	}

}
