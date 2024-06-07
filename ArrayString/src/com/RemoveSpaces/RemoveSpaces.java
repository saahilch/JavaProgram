package com.RemoveSpaces;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String With Spaces");
		String str=sc.nextLine();
		String replace=str.replaceAll("\\s", "");
				System.out.println(replace);

	}

}
