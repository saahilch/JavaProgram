/*For these progarm we need to get new array. 
 * Get the original array size & assign it to new array
 * then check the elemet is presetn in array or not if element is present then 
 * then skip these element & remaning emelents store in new array ie copy array  */
package com.RemoveElementFromArray;

import java.util.Arrays;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int elementToRemove = 1;
		int[] newArray = remove(originalArray, elementToRemove);
		System.out.println("Original Array" + Arrays.toString(originalArray));
		System.out.println("Removed Array" + Arrays.toString(newArray));
	}

	public static int[] remove(int[] array, int element) {
		int[] newArray = new int[array.length - 1];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != element) {
				newArray[index] = array[i];
				index++;
			}
		}
		return newArray;
	}
}
