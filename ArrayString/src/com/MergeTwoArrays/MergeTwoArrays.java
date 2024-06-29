package com.MergeTwoArrays;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 6, 7, 8, 9, 10 };
		int a = array1.length;
		int b = array2.length;
		int[] result = new int[a + b];
		System.arraycopy(array1, 0, result, 0, a);
		System.arraycopy(array2, 0, result, a, b);
		System.out.println(Arrays.toString(result));

	}

}
