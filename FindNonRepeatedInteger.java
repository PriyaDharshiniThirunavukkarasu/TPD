


public class FindNonRepeatedInteger {
public static void main(String[] args) {
	int a[] ={45,32,65,45,65,32,92};
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
