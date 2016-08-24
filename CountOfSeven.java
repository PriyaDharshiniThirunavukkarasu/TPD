public class CountOfSeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		count(number);
		System.out.println(answer);
	}
	static int answer = 0;
	public static void count(int input) {
		if (input > 0) {
			if (input % 10 == 7) {
				answer++;
			}
			input /= 10;
			count(input);
		}
	}
}
