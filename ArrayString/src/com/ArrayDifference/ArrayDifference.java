package com.ArrayDifference;

public class ArrayDifference {
	public static void main(String[] args) {
		// declare one variable & assing array to it.
		int array[] = { 1,2,3,4,5,6,9};
		System.out.println("The Differenec Between Array Element IS = " + differenceOfAraayElement(array));

	}
	/* Create one Method & declare two variable 1-sum initially =0 to store array of length 
	 * one for loop to traverse the array element 
	 * again declare two var min & max & assigin both an array elements
	 * again declare for loop to get every elemtnt of array 
	 * then store every element into min & max
	 * ten calculate difference between each element
	 * */ 
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
