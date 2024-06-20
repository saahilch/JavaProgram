package com.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

 class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5,6,1,2,3,4,};
		int []uniqarray=removeduplicate(array);
		System.out.println("originla array"+Arrays.toString(array));
		System.out.println("original array"+Arrays.toString(uniqarray));

	}

	private static  int[] removeduplicate(int[] array) {
		Set<Integer>set=new HashSet<>();
		for(int num:array) {
			set.add(num);
			
		}
		int[]result=new int [set.size()];
		int i=0;
		for(int num:set) {
			result[i++]=num;
		}
		
		return result;
	}

}
