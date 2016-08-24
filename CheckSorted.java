import java.util.Scanner;

public class CheckSorted {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int flag = 0;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
