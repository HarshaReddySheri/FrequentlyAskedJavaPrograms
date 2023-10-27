package comSno1.harsha.Numbers;

import java.util.Scanner;

/*
 * 1.Natural Number > 1
 * 2.which has only 2 factors 1 & itself
 * 
 * EX;
 * 19 -> 1 & 19 -> primeNumber
 * 28 -> 1,2,4,7,14,28 -> Not a prime Number
 * 
 * Ex: 2,3,5,7,11,13,17......
 */
public class A9CheckGivenNumberIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String check = "Prime";
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				check = "notAPrime";  //If given number is divisible ones then loop is Break so its notAPrime
				break;
			}
		}
		System.out.println("number is " + check);
		sc.close();
	}
}
