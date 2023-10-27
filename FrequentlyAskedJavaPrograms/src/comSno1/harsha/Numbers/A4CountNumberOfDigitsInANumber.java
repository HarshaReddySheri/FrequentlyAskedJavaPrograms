package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A4CountNumberOfDigitsInANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		
		while(num>0) {
			num = num/10; // This gives the Quotient for Every iteration it remove last number 
			count++;
		}
		System.out.println("Number of Digits:" + count);
		
		sc.close();
	}
}
