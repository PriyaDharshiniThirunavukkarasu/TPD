import java.util.Scanner;


public class BooleanMatrix {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows:");
	int row = s.nextInt();
	System.out.println("Enter number of columns:");
	int column = s.nextInt();
	boolean[][] matrix = new boolean[row][column];
	int count;
	int[] countOfFalse = new int[row];
	for(int i=0;i<row;i++){
		count=0;
		for(int j=0;j<column;j++){
			System.out.println("Enter value of matrix["+i+"]["+j+"]:");
			matrix[i][j]=s.nextBoolean();
			if(matrix[i][j]==false){
				count++;
			}
		}
		countOfFalse[i]=count;
	}
	int min=column+1;
	int index=-1;
	for(int i=0;i<row;i++){
		if(min>countOfFalse[i]){
			min = countOfFalse[i];
			index=i;
		}
	}
	System.out.println("Answer is "+(index+1));
}
}
