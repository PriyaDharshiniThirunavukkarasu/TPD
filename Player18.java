import java.util.Scanner;

public class Player18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int flag = 0;
		for (int i = 0; i < n;) {
			 i = i + arr[i];
			if (i == n - 1) {
				System.out.println(true);
				System.exit(0);
			}
			if ( arr[i] == 0) {
				System.out.println(false);
				System.exit(0);
			}
		}
		System.out.println(false);
	}
}
