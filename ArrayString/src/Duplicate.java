import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Remove Duplicate Char");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		
	}
}
