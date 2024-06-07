package com.NumberPattern;

public class NumberPattern {

	public static void main(String[] args) {
		int row = 5, num = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		System.out.println("--------------------");

		for (int i = row; i >= 0; i--) {
			for (int j = i; j >= 2; j--) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == 0 || i == row - 1 || j == 0 || j == row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for (int i = 0; i < row; i++) {
			for (int j = 2; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
