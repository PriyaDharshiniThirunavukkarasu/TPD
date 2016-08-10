import java.util.Scanner;

public class Pro33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for (int i = s.length(); i >= 0; i--) {
			for (int x = 0; x < s.length(); x++) {
				if (i > x) {
					String s1 = s.substring(x, i);
					if (s1.compareTo(s) > 0) {
						System.out.println(s1);
						System.exit(0);
					}
				}
			}
		}
	}
}
