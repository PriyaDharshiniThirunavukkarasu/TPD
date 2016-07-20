import java.util.Scanner;


public class ArrayElementOccurringOnce {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	int a[] = new int[5];
	for(int i=0;i<5;i++){
		a[i]=s.nextInt();
	}
	int flag[] = new int[5];
	for(int i=0;i<5;i++){
		int count=0;
		for(int j=0;j<5;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		flag[i]=count;
	}
	int index=-1;
	for(int i=0;i<5;i++){
		if(flag[i]==1){
			index=i;
		}
	}
	System.out.println("Answer is "+a[index]);
	
}
}
