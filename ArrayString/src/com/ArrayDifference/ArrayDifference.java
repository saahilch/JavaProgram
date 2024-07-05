package com.ArrayDifference;

public class ArrayDifference {
	public static void main(String[] args) {
		int array[] = { 1,100,1000 };
		System.out.println("Total Difference Between Array Element Is = " + sumOfDiff(array));

	}

	public static int sumOfDiff(int array[]) {
		int sum = 0, n = array.length;
		for (int i = 0; i < n; i++) {
			int min = array[i];
			int max = array[i];

			for (int j = i; j < n; j++) {
				min = Math.min(min, array[j]);
				max = Math.max(max, array[j]);
				sum += (max - min);
			}
		}
		return sum;

	}

}
