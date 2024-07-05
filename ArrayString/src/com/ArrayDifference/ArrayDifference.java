package com.ArrayDifference;

public class ArrayDifference {
	public static void main(String[] args) {
		int array[] = { 2, 3,4 };
		System.out.println("The Differenec Between Array Element IS = " + differenceOfAraayElement(array));

	}

	static int differenceOfAraayElement(int array[]) {
		int sum = 0, n = array.length;
		for (int i = 0; i < n; i++) {
			int minimun = array[i];
			int maximum = array[i];
			for (int j = i; j < n; j++) {
				minimun = Math.min(minimun, array[j]);
				maximum = Math.max(maximum, array[j]);
				sum += (maximum - minimun);
			}
		}
		return sum;
	}

}
