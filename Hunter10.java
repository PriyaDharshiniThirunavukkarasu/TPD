import java.util.Scanner;


public class Hunter10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		int size1 = scan.nextInt();
		int size2 = scan.nextInt();
		int [] arr1 = new int[size1];
		int [] arr2 = new int[size2];
		for( int i = 0; i < size1; i++ ) {
			arr1[i] = scan.nextInt();
		}
		for( int i = 0; i < size2; i++ ) {
			arr2[i] = scan.nextInt();
		}
		int count = 0;
		for( int i = 0; i < size1; i++ ) {
			for ( int j = 0; j < size2; j++) {
				if (arr1[i] == arr2[j]) {
					count ++;
					break;
				}
			}
		}
		if (count == size1) {
			System.out.println("array1 is a subset of array2");
		}
	}
}
