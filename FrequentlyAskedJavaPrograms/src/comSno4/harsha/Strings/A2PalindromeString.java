package comSno4.harsha.Strings;

import java.util.Scanner;

//A palindrome string is a string that remains the same when its characters are reversed like MADAM
public class A2PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		
		String Org_Str = str;
		
		String rev = "";
		int len = str.length();
		for (int i = len-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		//System.out.println("Reversed String is: " + rev);
		if (Org_Str.equals(rev)) {
			System.out.println(Org_Str + " is Palindrome String");
		}
		else {
			System.out.println(Org_Str + "is Not Palindrome String");
		}
		
		sc.close();
	}
	
	
}
