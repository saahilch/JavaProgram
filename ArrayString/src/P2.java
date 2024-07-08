import java.util.LinkedHashMap;
import java.util.Map;

public class P2 {
	public static void main(String[] args) {
		lengthoflongeststring("aabbccdd");

	}

	private static void lengthoflongeststring(String s) {
		String Longest = null;
		int lengthString = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}

		}
		if (map.size() > LengthString) {
			lengthString = map.size();
			Longest = map.keySet().toString();

		}

	}

}
