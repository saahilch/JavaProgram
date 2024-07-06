import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 1, 1, 2, 1, 1, 2, 1 ,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int remove[] = removed(array);
		System.out.println(Arrays.toString(remove));
	}

	private static int[] removed(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}

		int i = 0;
		int result[] = new int[set.size()];

		for (int num : set) {
			result[i++] = num;
		}

		return result;
	}
}
