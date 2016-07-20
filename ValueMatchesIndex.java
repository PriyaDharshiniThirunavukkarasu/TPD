public class ValueMatchesIndex {
	public static void main(String[] args) {
		int[] a = { -3,-1,1,3,5};
		int result = findIndex(a);
		System.out.println("Answer is: "+result);
	}
	public static int findIndex(int[] a){
		for(int i=0;i<a.length;i++){
			if(i==a[i]){
				return i;
			}
		}
		return -1;
	}
}
