import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int length=sc.nextInt();
		int sum []=new int[length];
		System.out.println("Enter Element In Array");
		for(int i=0;) {
			
		}
		
		/*
		 * Scanner sc = new Scanner(System.in); // String str; char ch[] =
		 * sc.nextLine().toCharArray(); // created empty array & store array element
		 * statically & convert it into to // character array System.out.println(ch);
		 * for (int i = ch.length - 1; i >= 0; i--) { System.out.print(ch[i]); }
		 */
		
		private static int[]twoSum(int num[],int target){
			Map<Integer,Integer>map=new HashMap();
			for(int i=0;i<num.length;i++) {
				int complement=target-num[i];
				if(map.containsKey(complement)) {
					return new int[] {i,map.get(complement)};
				}
				map.put(num[i],i);
		
			}
		}	
	}

}
