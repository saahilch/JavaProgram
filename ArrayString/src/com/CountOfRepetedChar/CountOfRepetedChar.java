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
//Program to Find Longest Substrig Without Repeting Character
package com.FindingLongestSubstring;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindingLongestSubstring {

	public static void main(String[] args) {
		LengthOfLongestSubstirgLength("abbacn");
	}

	private static void LengthOfLongestSubstirgLength(String s) {
		String LongestSubstring = null;
		int LogestSubstringLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			}

			else {
				i = map.get(ch);
				
				map.clear();
			}
		}
		if (map.size() > LogestSubstringLength) {
			LogestSubstringLength = map.size();
			LongestSubstring = map.keySet().toString();
		}

		System.out.println("The Length Of Substring " + LongestSubstring);
		System.out.println("The Longest Substring Length " + LogestSubstringLength);

	}
}
s