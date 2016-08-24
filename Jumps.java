import java.util.Scanner;

public class Jumps {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int answer = 0;
		for (int i = 0; i < size;) {
			if (arr[i] == 0) {
				break;
			}
			answer = i;
			i += arr[i];
		}
		if (answer == size - 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
