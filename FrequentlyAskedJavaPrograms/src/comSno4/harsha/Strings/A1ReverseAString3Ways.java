package comSno4.harsha.Strings;

import java.util.Scanner;

public class A1ReverseAString3Ways {
	
	public class UsingCharAt{
		public static void main(String[] args) {
			
			System.out.println("UsingConcatenation");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String: ");
			String str = sc.nextLine();
			
	        int len = str.length();
	        String rev = "";
	        
	        for (int i = len -1 ; i >= 0; i--) {
	            rev =  rev + str.charAt(i);
	        }
	        System.out.println("Reversed string is :" + rev);
	        
	        sc.close();
	    }	
	}
	public class UsingCharacterArray{
		public static void main(String[] args) {
			System.out.println("UsingCharacterArray");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String: ");
			String str = sc.nextLine();
			
			char a [] = str.toCharArray();
			
			int len = a.length;
	        String rev = "";
	        for (int i = len -1 ; i >= 0; i--) {
	            rev =  rev + a[i];
	        }
	        System.out.println("Reversed string is :" + rev);
			
			sc.close();
			
			/*
			 * Explanation
			 * ===========
			 * 
			 * input = ABCD
			 * 		   0123
			 * By indexing
			 * ********************************
			 * 1st iteration
			 * i = len -1 ; i >= 0 ; i--
			 * i = 4-1=3 ; 3>=0; i--
			 * 
			 * rev = rev + a[i];
			 * rev = rev + 3
			 * rev = D
			 * ********************************
			 * 2nd iteration
			 * i = len -1 ; i >= 0 ; i--
			 * i = 3-1=2 ; 2>=0; i--
			 * 
			 * rev = rev + a[i];
			 * rev = rev + 2
			 * rev = C
			 * ********************************
			 * 1st iteration
			 * i = len -1 ; i >= 0 ; i--
			 * i = 2-1=1 ; 1>=0; i--
			 * 
			 * rev = rev + a[i];
			 * rev = rev + 1
			 * rev = B
			 * *******************************
			 * 1st iteration
			 * i = len -1 ; i >= 0 ; i--
			 * i = 1-1=0 ; 0>=0; i--
			 * 
			 * rev = rev + a[i];
			 * rev = rev + 0
			 * rev = A
			 * 
			 * 
			 * Output: DCBA
			 * 
			 * 
			 * 
			 * 
			 */
		}
	}
	public class UsingStringBuffer{
		public static void main(String[] args) {
			System.out.println("UsingStringBuffer");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String: ");
			String str = sc.nextLine();
			
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
			sc.close();
		}
	}
	
}
