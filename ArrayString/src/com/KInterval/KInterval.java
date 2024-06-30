package com.KInterval;

import java.util.Arrays;

public class KInterval {
	public static void main(String[] args) {

		int[] arr = { 50, 60, 80, 77, 50, 60,99,100,101 };
		int n = arr.length;
		int k = 3;
		printMAX(arr, n, k);
	}

	private static void printMAX(int[] arr, int n, int k) {

		int[] brr = new int[n];
		Arrays.fill(brr, 0);
		int[] crr = new int[n];

		for (int i = 0; i <n; i++) {
			crr[i] = arr[i];

		}
		for (int i = 0; i < k; i++) {
			int maxi = Integer.MIN_VALUE;
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (maxi < arr[j]) {
					maxi = arr[j];
					index = j;
				}
			}
			brr[index] = 1;
			arr[index] = Integer.MIN_VALUE;
		}
		for (int i = 0; i < n; i++) {
			if (brr[i] == 1)
				System.out.print(crr[i] + " ");
		}

	}
}