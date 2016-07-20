


public class FindUnique {
public static void main(String[] args) {
	int a[] = new int[]{12,45,32,65,45,65,32};
	System.out.println("Answer is "+findUniquee(a));
}
public static int findUniquee(int[] a){
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
	return a[index];
	
}
}
