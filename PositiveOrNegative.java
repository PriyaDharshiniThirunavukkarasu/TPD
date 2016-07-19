import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number == 0) {
			System.out.println(number + " is zero");
		} else if (number > 0) {
			System.out.println(number + " is Positive");
		} else {
			System.out.println(number + " is Negative");
		}
	}
}
