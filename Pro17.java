import java.util.Scanner;

public class Pro17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = input; i > 0; i--) {
			String s1 = "" + i;
			int len = s1.length();
			int[] nums = new int[len];
			for (int j = 0; j < len; j++) {
				nums[j] = Integer.parseInt(s1.substring(j, j + 1));
			}
			int ans = i;
			for (int j = 0; j < len; j++) {
				ans *= nums[j];
			}
			if (ans == input) {
				System.out.println(i);
			}
		}
	}
}
