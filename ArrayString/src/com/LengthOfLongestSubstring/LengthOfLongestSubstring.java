package com.LengthOfLongestSubstring;

import java.util.Scanner;

class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int[] count = new int[128]; // Assuming ASCII characters (0-127)

		// Using two pointers (l and r) to represent the sliding window
		for (int l = 0, r = 0; r < s.length(); r++) {
			// Increment count for the character at position r
			count[s.charAt(r)]++;

			// If count for any character becomes greater than 1, move l rightward
			// until all characters in the current window are unique
			while (count[s.charAt(r)] > 1) {
				count[s.charAt(l)]--;
				l++;
			}

			// Update the maximum length of substring without repeating characters
			ans = Math.max(ans, r - l + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
		int length = solution.lengthOfLongestSubstring(input);
		System.out.println("Length of the longest substring without repeating characters: " + length);

		scanner.close();
	}
}
