import java.util.Scanner;

public class IdenticalChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String out = "";
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				out += input.charAt(i) + "*";
			} else {
				out += input.charAt(i);
			}
		}
		out += input.charAt(input.length()-1);
		System.out.println(out);
	}
}
