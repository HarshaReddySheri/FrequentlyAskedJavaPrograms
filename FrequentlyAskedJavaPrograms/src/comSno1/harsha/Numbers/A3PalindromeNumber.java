package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A3PalindromeNumber {
	//A palindrome number is a number that remains the same when it's digits are reversed like 16461
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int Org_num = num;
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		/*Explanation
		 *===========
		 * input = 16461
		 * 
		 * % -> Remainder
		 * / -> Quotient

		 * 1st iteration
		 * 0 * 10 + 16461 % 10 = 0 + 1 = 1
		 * 16461 / 10 = 1646
		 * 
		 * 2nd iteration
		 * 1 * 10 + 1646 % 10 = 10 + 6 = 16
		 * 1646 / 10 = 164 
		 * 
		 * 3rd iteration
		 * 16 * 10 + 164 % 10 = 160 + 4 = 164
		 * 164 / 10 = 16
		 * 
		 * 4th iteration
		 * 164 * 10 + 16 % 10 = 1640 + 6 = 1646
		 * 16 / 10 = 6
		 * 
		 * 5th iteration
		 * 1646 * 10 + 1 % 10 = 16460 + 1 = 16461 
		 * 1 / 10 = 0
		 * 
		 * output = 16461
		 */
		
		
		if(Org_num == rev) {
			System.out.println(Org_num + " Palindrome Number ");
		}
		else {
			System.out.println(Org_num + "Not Palindrome Number");
		}
		
		sc.close();
	}
}
