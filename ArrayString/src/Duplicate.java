import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "aaabcdef";
		StringBuffer sb = new StringBuffer();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);
		System.out.println("----------------------------------------------");

		StringBuffer sbc = new StringBuffer();
		StringBuffer sbcc = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i + 1);
			if (index == -1) {
				sbc.append(ch);
			}
		}

		System.out.println(sbc);
		System.out.println("---------------------------------------------------");

		List<String> originalList = Arrays.asList("aa", "aa", "bb", "cc", "1", "2", "-1", "-3", "-2");
		List<String> removedList = originalList.stream().distinct().collect(Collectors.toList());
		System.out.println(removedList);

		System.out.println("---------------------------------------------------");
		char arr[] = str.toCharArray();
		for (int i = originalList.size() - 1; i >= 0; i--) {
			System.out.print(originalList.get(i));
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		for (int i = removedList.size() - 1; i >= 0; i--) {

			System.out.print("[" + removedList.get(i) + "]");

		}
		Collections.sort(originalList);
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println(originalList);
		System.out.println("---------------------------------------------------");
		List<String> ace = originalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// Collections.sort(originalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(ace);
	}

}
