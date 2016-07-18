import java.util.Scanner;

public class XsubstringOfY {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter String X:");
	String x= s.next();
	System.out.println("Enter String Y:");
	String y =s.next();
	if(y.contains(x)){
		System.out.println(x+" is a substring of "+y);
	}
	else{
		System.out.println(x+" is not a substring of "+y);
	}
}
}
