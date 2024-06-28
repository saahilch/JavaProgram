package com.RemoveDuplicateChar;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Contain Dulicate Values");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);

		System.out.println("---Using IndexOf Method---");
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb1.append(ch);
			}

		}
		System.out.print(sb1);
		System.out.println();
		System.out.println("---Using toCharArray Method");
		char[] arr = str.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeted = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeted = true;
					break;
				}
			}
			if (!repeted) {
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);
		System.out.println();
		System.out.println("---Using Set Mehod--");
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb3.append(c);
		}
		System.out.println(sb3);
		
		//Using List Method
		
		List<String>originalList=Arrays.asList("aa","bb","aa");
		List<String>removedList=originalList.stream().distinct().collect(Collectors.toList());
		System.out.println("Original list "+ originalList + "\n RemovedList - "+removedList);
		
		

	}

}
