
public class SumOfElements {
public static void main(String[] args) {
	int[] a={2,7,11,13};
	findSum(a,9);
}
public static void findSum(int[] a, int target){
	for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]+a[j]==target){
				System.out.println("Answer is "+a[i]+" and "+a[j]);
			}
		}
	}
}
}
