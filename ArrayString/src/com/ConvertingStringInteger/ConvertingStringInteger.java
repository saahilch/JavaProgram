package com.ConvertingStringInteger;

public class ConvertingStringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		String strNumber1 = String.valueOf(number);
		System.out.println("Converted Using Value Of " + strNumber1);
		// Apporach 2
		String strNumber2 = number + " ";
		System.out.println("Using Concatniation " + strNumber2);
		String strNumber = "1234";
		int number3 = Integer.parseInt(strNumber);
		System.out.println("Integer To Stirng " + number3);
	}

}

