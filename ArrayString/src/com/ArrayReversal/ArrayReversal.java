package com.ArrayReversal;

import java.util.Scanner;

public class ArrayReversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Reverse");
		String str = sc.nextLine();
		char[] chArr = str.toCharArray();
		int length = str.length();
		System.out.println("Total Characters in String = " + length);
		System.out.println(str);
		for (int i = chArr.length - 1; i >= 0; i--) 
		{
			System.out.print(chArr[i]);

		}

		System.out.println();
		System.out.println("---------------------");

		// Using String Buffer Method
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());

	}

}
