package com.SerchingArrayElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerchingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 20, 30, 50, 40, 60 };
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to Serch");
		int sc=30;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == sc) {
				list.add(i);
			}

		}
		if (!list.isEmpty()) {
			System.out.println("Element Found at " + sc);

		} else {
			System.out.println("Element is Not Found at " + sc);
		}

	}

}
