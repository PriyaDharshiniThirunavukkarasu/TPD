
public class Pro1 {
	public static void main(String[] args) {
		String[] names = { "ic", "ice", "ice", "iced" };
		longestPrefix(names);
	}

	public static void longestPrefix(String[] input) {
		int len = input.length;
		int count = 0;
		int x = 0;
		while (true) {
			int k = 0;
			for (int i = 0; i < len - 1; i++) {
				if (input[i].length() > x && input[i + 1].length() > x
						&& input[i].charAt(x) == input[i + 1].charAt(x)) {
					k++;
				}
			}
			if (k == len - 1) {
				count++;
				x++;
			} else {
				break;
			}
		}
		System.out.println(input[0].substring(0, count));
	}
}
