package com.RandomNumber;

import java.util.Random;

public class RandomNumber {
public static void main(String[]args) {
	

	Random t=new Random();
	for(int i = 1;i<=10;i++)
	{
		System.out.print(" "+ t.nextInt(100));
	}
}
}
