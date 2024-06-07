package com.RemoveSymbol;

import java.util.Scanner;

public class RemoveSymbol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		//String str="!@#s$%^&*()_+-=/*-a+.[]h {i};l'<>,./|`~";
			System.out.println("Enter String With Special Character");
			String str=sc.nextLine();
			String remove=str.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(remove);

	}

}
