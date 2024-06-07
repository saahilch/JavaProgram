package com.ReverseEachString;

import java.util.Scanner;

public class ReverseEachString {

	public static void main(String[] args) {
		// SAHIL CHAVAN-
		// LIHAS NAVAHC
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String input = sc.nextLine();
		System.out.println("original String  \n" + input);
		String[] words = input.split(" ");
		String output = " ";
		for (String word : words) {
			String reWord = " ";
			for (int i = word.length() - 1; i >= 0; i--) {
				reWord = reWord + word.charAt(i);
			}
			output = output + reWord + " ";
		}
		System.out.println(output);
	}

}
