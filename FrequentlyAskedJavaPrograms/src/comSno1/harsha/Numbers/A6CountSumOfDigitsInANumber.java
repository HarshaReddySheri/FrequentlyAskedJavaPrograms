package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A6CountSumOfDigitsInANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
			sum = sum + num % 10;    //EX num = 1234 This give Last Number for every iteration 4  3  2  1
			num = num/10;			// EX num = 1234 This remove Last Number for every iteration 123  12  1 it assign to num in while loop
		}
		System.out.println("Sum of Digits in a number: " + sum);
		sc.close();
	}
}
