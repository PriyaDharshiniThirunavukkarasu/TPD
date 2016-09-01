import java.util.Scanner;

public class Player24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int flag = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) || ch == 'e' || ch == 'E' || ch == '.') {
				flag++;
			}
		}
		if (flag != input.length()) {
			System.out.println(false);
		} else {
			flag = 0;
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (ch == 'e') {
					flag++;
				}
			}
			if (flag > 1) {
				System.out.println(false);
			} else {
				flag = 0;
				for (int i = 0; i < input.length(); i++) {
					char ch = input.charAt(i);
					if (ch == '.') {
						flag++;
					}
				}
				if (flag > 1) {
					System.out.println(false);
				} else {
					System.out.println(true);
				}
			}
		}
	}
}
