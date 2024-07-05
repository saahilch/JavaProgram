package com.KintervealAddition;

public class KintervealAddition {
	static int max_sum_of_subarray(int[] array, int n, int k) {
		int max_sum = 0;
		for (int i = 0; i + k <= n; i++) {
			int temp = 0;
			for (int j = i; j < i + k; j++) {
				temp += array[j];
			}
			if (temp > max_sum)
				max_sum = temp; 

		}
		return max_sum;

	}
	public static void main(String[] args) {
		int array[] = {2, 20, 23, 3, 1, 0, 200,1,4};
		int n = array.length;
		int k = 2;
		
		int max_sum = max_sum_of_subarray(array, n, k);
			System.out.println(max_sum);
	
	}

	 

}
