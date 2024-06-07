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
