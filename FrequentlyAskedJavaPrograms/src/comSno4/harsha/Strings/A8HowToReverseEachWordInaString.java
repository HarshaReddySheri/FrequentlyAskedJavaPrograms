package comSno4.harsha.Strings;



public class A8HowToReverseEachWordInaString {

	public class Approach1{
		public static void main(String[] args) {
			String str = "Welcome to Java";
			String [] words = str.split(" ");
			String reverseString = "";
			
			for(String W : words) {
				String reverseWord = "";
				
				for(int i = W.length()-1; i>=0; i--) {
					reverseWord = reverseWord + W.charAt(i);
				}
				reverseString = reverseString + reverseWord + " ";
			}
			System.out.println(reverseString);
		}
	}

	public class Approach2{
		public static void main(String[] args) {
			String str = "Welcome To Java";
			String [] words = str.split(" ");
			String reverseWord = "";
			
			for (String w : words) {
				StringBuilder sb = new StringBuilder(w);
				sb.reverse();
				
				reverseWord = reverseWord + sb.toString() + " ";
			}
			System.out.println(reverseWord);
		}
	}
}