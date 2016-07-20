public class RemoveCharacter {
	public static void main(String[] args) {
		String str = "maedam";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			if(str.charAt(i) != str.charAt(len-1-i)){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
