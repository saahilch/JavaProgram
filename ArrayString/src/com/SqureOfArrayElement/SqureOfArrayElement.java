package com.SqureOfArrayElement;

import java.util.Arrays;
import java.util.Scanner;

public class SqureOfArrayElement {

	public static void main(String[] args) {

		int arr[] = { -2, -5, -8, -9, 3, 4, 10, 23 };
		int n = arr.length;
		System.out.println("Before Sort");

		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		System.out.println("After Sort");
		SortedArraySqure(arr);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
	}

	public static void SortedArraySqure(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		Arrays.sort(arr);
	}

}