package com.Overloding;

public class Overloding {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a=5,b=10,c=15;
		System.out.println("add() with 2 parameters");
		System.out.println(add(a,b));
		System.out.println("add() with 3 parameters");
		System.out.println(add(a,b,c));
	}

}
