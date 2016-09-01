import java.util.Scanner;

public class Player14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		System.out.println(sb);
		char[] vowels = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
		for (int i = 0; i < sb.length(); i++) {
			int index = -1;
			char ch = sb.charAt(i);
			for (int j = 0; j < 10; j++) {
				if (ch == vowels[j]) {
					index = i;
					break;
				}
			}
			if (index != -1) {
				sb.deleteCharAt(index);
			}
		}
		System.out.println(sb);
	}
}
