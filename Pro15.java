
public class Pro15 {
	public static void main(String[] args) {
		int[] input = { 31, 14, 15, 7, 2, 4, 3 };
		String[] binary = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			binary[i] = Integer.toBinaryString(input[i]);
		}
		int[] count = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < binary[i].length(); j++) {
				if (binary[i].charAt(j) == '1') {
					count[i]++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = i + 1; j < count.length; j++) {
				if (count[i] < count[j]) {
					int temp = count[i];
					count[i] = count[j];
					count[j] = temp;
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = i + 1; j < count.length; j++) {
				if (count[i] == count[j] && input[i] < input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
