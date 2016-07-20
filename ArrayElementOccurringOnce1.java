


public class ArrayElementOccurringOnce1 {
public static void main(String[] args) {
	int a[] = new int[]{1,3,5,3,1,5,7};
	int flag[] = new int[a.length];
	for(int i=0;i<a.length;i++){
		int count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		flag[i]=count;
	}
	int index=-1;
	for(int i=0;i<a.length;i++){
		if(flag[i]==1){
			index=i;
		}
	}
	System.out.println("Answer is "+a[index]);
	
}
}
