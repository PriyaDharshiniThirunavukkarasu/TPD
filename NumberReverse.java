public class NumberReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num > 0) {
			System.out.print(num % 10);
			num /= 10;
		}
	}
}
