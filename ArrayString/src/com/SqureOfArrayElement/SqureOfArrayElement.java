package com.SqureOfArrayElement;

import java.util.Arrays;
import java.util.Scanner;

public class SqureOfArrayElement {

	public static void main(String[] args) {

		int arr[] = { -1, -8, -6, 2, 3, 10, 11 };
		int n = arr.length;
		System.out.println("Befor Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("");
		System.out.println("After Sort");
		SortedSqure(arr);
		
		for (int i = 0; i < n; i++)

			System.out.print(arr[i] + " ");
	}

	public static void SortedSqure(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		Arrays.parallelSort(arr);

	}
}