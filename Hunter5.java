import java.util.Scanner;

public class Hunter5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		possibleString(inp);
	}

	public static void possibleString(int input) {
		String inp = "" + input;
		int len = inp.length();
		String ans = "";
		for (int i = 0; i < len; i++) {
			ans += (char) (Integer.parseInt(inp.substring(i, i + 1)) + 96);
		}
		System.out.println(ans);
		for (int i = 0; i < len - 1; i++) {
			ans = "";
			for (int j = 0; j < i; j++) {
				ans += (char) (Integer.parseInt(inp.substring(j, j + 1)) + 96);
			}
			int x = Integer.parseInt(inp.substring(i, i + 2));
			if (x <= 26) {
				ans += (char) (x + 96);
			} else {
				continue;
			}
			for (int j = i + 2; j < len; j++) {
				ans += (char) (Integer.parseInt(inp.substring(j, j + 1)) + 96);
			}
			System.out.println(ans);
		}
		ans = "";
		for (int i = 0; i < len;) {
			if (i + 1 < len) {
				int x = Integer.parseInt(inp.substring(i, i + 2));
				if (x <= 26) {
					ans += (char) (x + 96);
					i += 2;
				} else {
					ans += (char) (Integer.parseInt(inp.substring(i, i + 1)) + 96);
					i++;
				}
			} else {
				ans += (char) (Integer.parseInt(inp.substring(i, i + 1)) + 96);
				i++;
			}
		}
		System.out.println(ans);
	}
}
