package com.CountOfRepetedChar;

import java.util.Arrays;

public class CountOfRepetedChar {

	public static void main(String[] args) {
		String input = "opentexttt";
		char charToReplace = 't';
		if (input.indexOf(charToReplace) == -1) {
			System.out.println("string is not avaliable");
			System.exit(0);
		}
		// logic to replace char occoance in string
//		char[] arr = input.toCharArray();
//		int cnt = 1;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == charToReplace) {	
//				arr[i] = String.valueOf(cnt).charAt(0);
//				cnt++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		int cnt=1;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch==charToReplace)
			{
				input=input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
						cnt++;
				
			}
		}
		System.out.println(input);
	}

}
