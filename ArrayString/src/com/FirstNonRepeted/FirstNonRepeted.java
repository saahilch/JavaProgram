package com.FirstNonRepeted;

public class FirstNonRepeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "QQABC";
		for (int i = 0; i < input.length(); i++)

		{
			boolean unique = true;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j))
					unique = false;
			}

			if (unique) {
				System.out.println(input.charAt(i));
				break;
			}
		}
	}

}
