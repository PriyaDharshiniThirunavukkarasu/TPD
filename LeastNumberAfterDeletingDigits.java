public class LeastNumberAfterDeletingDigits {
	public static void main(String[] args) {
		int number = 594783;
		int num = number;
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		num = number;
		int digits[] = new int[count];
		for(int i=0;i<count;i++){
			digits[i] = num%10;
			num /= 10;
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (digits[i] > digits[j]) {
					int temp = digits[i];
					digits[i] = digits[j];
					digits[j] = temp;
				}
			}
		}
		int ans = (10 * digits[0]) + digits[1];
		System.out.println(ans);
	}
}
