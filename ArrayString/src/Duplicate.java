import java.util.Arrays;
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
		System.out.println("----------------------------------------------");

		List<String> originalList = Arrays.asList("aa", "aa", "bbb","11","11");
		List<String> removedList = originalList.stream().distinct().collect(Collectors.toList());
		System.out.println(removedList);
	}

}
