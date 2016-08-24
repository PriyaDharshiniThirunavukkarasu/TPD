import java.util.Scanner;

public class Isomorphic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in1 = scan.next();
		String in2 = scan.next();
		if (in1.length() == in2.length()) {
			for (int i = 0; i < in1.length(); i++) {
				in1 = in1.replace(in1.charAt(i), in2.charAt(i));
			}
			if (in1.equals(in2)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
	}
}
