package com.SqureOfArrayElement;

import java.util.Arrays;
import java.util.Scanner;

public class SqureOfArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { -6, -3, -1, -2, 5, 7 };
		int n = arr.length;
		System.out.println("Befor Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		sortSqures(arr);
		System.out.println("");
		System.out.println("After Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void sortSqures(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		Arrays.sort(arr);

	}

}