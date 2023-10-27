package comSno1.harsha.Numbers;

import java.util.Scanner;

//A factorial is a function that multiplies a number by every number below it.

/*
 * For Ex:
 * 
 * Ascending Order ==>>>  5! = 1*2*3*4*5 = 120
 * Descending Order ==>>> 5! = 5*4*3*2*1 = 120
 * 
 */

public class B2FactorialOfANumber {
	public class AscendingOrder{
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			
			long factorial = 1;
			
			for (int i = 1; i <= num ; i++) {
				factorial = factorial * i;
			}
			System.out.println("factorial of a number is: " + factorial);
			sc.close();
		}	
	}
	public class DescendingOrder{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			
			long factorial = 1;
			for (int i = num; i >= 1; i--) {
				factorial = factorial * i;
			}
			System.out.println("factorial of a number is: " + factorial);
			
			sc.close();
		}
	}
}
