import java.util.Scanner;

public class Player15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine();
		String[] input = inp.split(" ");
		String ans = "";
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length(); j++) {
				int count = 0;
				for (int k = 0; k < input[i].length(); k++) {
					if (input[i].charAt(j) == input[i].charAt(k)) {
						count++;
					}
				}
				if (count > max) {
					ans = input[i];
					max = count;
				}
			}
		}
		System.out.println(ans);
	}
}
