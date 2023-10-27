package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A5CountNumberOfEven_OddDigitsINANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt(); 
		int evenCount = 0;
		int oddCount = 0;

		while(num>0) {
			int rem = num % 10; // EX num = 1234 This give Last Number for every iteration 4  3  2  1
			if(rem % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			num = num/10;		// EX num = 1234 This remove Last Number for every iteration 123  12  1 it assign to num in while loop

		}
		System.out.println("Number of Even Numbers: " + evenCount);
		System.out.println("Number of Odd Numbers: " + oddCount);
		sc.close();
	}
}
