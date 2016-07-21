import java.util.Scanner;

public class WorkingDay {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a day value:");
		String day = s.next();
		switch (day) {
		case "Sunday":
			System.out.println(false);
			break;
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
		case "Saturday":
			System.out.println(true);
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}
