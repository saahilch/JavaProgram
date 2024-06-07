package com.AlphabeticalOrder;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		System.out.println("--Using array Method");
		System.out.println("Enter String to Reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char temp;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(new String(arr));
		System.out.println();
		//------------------------------------------
		System.out.println("--Using sort method");
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		System.out.println(new String(charArr));
	}

}
