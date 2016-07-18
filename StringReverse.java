import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a String:");
	StringBuffer sb = new StringBuffer( s.next());
	System.out.println(sb.reverse());
}
}
