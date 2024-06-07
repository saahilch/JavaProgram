package com.ArrayTwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayTwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int[] num = new int[length];
		System.out.println("Enter Elements In Array");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Enter Target Value");
		int target = sc.nextInt();
		int[] result = twoSum(num, target);
		System.out.println("Indices of the two number" + result[0] + ',' + result[1]);

	}

	private static int[] twoSum(int[] num, int target) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];
			if (map.containsKey(complement)) {
				return new int[] { i, map.get(complement) };
			}
			map.put(num[i], i);
		}
		return new int[0];

	}

}
