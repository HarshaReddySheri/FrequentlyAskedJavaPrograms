package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A2ReverseANumber3Ways {
	public class UsingAlgorithm{
		public static void main(String[] args) {
			System.out.println("UsingAlgorithm");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			
			int rev = 0;
			while(num!=0) {
				rev = rev * 10 + num % 10;  // 0 + 1234 % 10 = 4
				num = num/10;               // 1234/10 = 123
			}
			System.out.println("Reverse Number is :" + rev);
			
			/*Explanation
			 *===========
			 * input = 1234
			 * 
			 * 1st iteration
			 * 0 * 10 + 1234 % 10 = 4
			 * 1234 / 10 = 123
			 * 
			 * 2nd iteration
			 * 4 * 10 + 123 % 10 = 40 + 3 = 43
			 * 123 / 10 = 12 
			 * 
			 * 3rd iteration
			 * 43 * 10 + 12 % 10 = 430 + 2 = 432
			 * 12 / 10 = 1
			 * 
			 * 4th iteration
			 * 432 * 10 + 1 % 10 = 4320 + 1 = 4321
			 * 1 / 10 = 0
			 * 
			 * output = 4321
			 */
			sc.close();
		}
	}
	public class UsingStringBufferClass{
		public static void main(String[] args) {
			System.out.println("UsingStringBufferClass");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			
			StringBuffer sb = new StringBuffer(String.valueOf(num));
			StringBuffer rev = sb.reverse();
			System.out.println("Reverse Number is: " + rev);
			sc.close();
		}
		
	}
	public class UsingStringBuilderClass{
		public static void main(String[] args) {
			System.out.println("UsingStringBuilderClass");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			
			StringBuilder sb1 = new StringBuilder();
			sb1.append(num);
			StringBuilder rev = sb1.reverse();
			System.out.println("Reverse Number is :" + rev);
			sc.close();
		}	
	}
}
