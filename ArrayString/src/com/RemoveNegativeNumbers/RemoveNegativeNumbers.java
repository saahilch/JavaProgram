package com.RemoveNegativeNumbers;



public class RemoveNegativeNumbers {
	public static void main(String[] args) {
//		int array[] = { 2, -1, 4, -3, 5, -7, 8, 9 };
//		int length = array.length;
//		int j = 0, temp;
//
//		for (int i = 0; i < length; i++) {
//			if (array[i] < 0) {
//				if (i != j) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//
//				}
//				j++;
//			}
//		}
//		// iterate  element one by one
//		for (int i = 0; i < length; i++) {
//			System.out.print(array[i] + ",");
//		}
		int array[] = { 1, 2, 3, 4, -5, -6, -7, -8 };
		int lengthOfArray = array.length;
		int initialStage = 0, temp;
		for (int i = 0; i < lengthOfArray; i++) {
			if(array[i]<0) {
				if (i != initialStage) {
					temp = array[i];
					array[i] = array[initialStage];
					array[initialStage] = temp;
				}
				initialStage++;
	
			}
					}
		for (int i = 0; i < lengthOfArray; i++) {
			System.out.print(array[i]+",");
		}

	}
}
