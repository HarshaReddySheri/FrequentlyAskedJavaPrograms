package comSno1.harsha.Numbers;

import java.util.Scanner;

public class A7FindLargestOf3Numbers2Ways {
	public class Approch1{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number");
			int a = sc.nextInt();

			System.out.println("Enter the Second Number");
			int b = sc.nextInt();

			System.out.println("Enter the Third Number");
			int c = sc.nextInt();

			/*
			 * Approch1 - Logic
			 *  a=10, b=20, c=30
			 *  a>b and a>c --> a largest
			 *  b>a and b>c --> b largest
			 *  c>a and c>b --> c largest
			 */
			
			
			if(a > b && a > c) {
				System.out.println(a + "is Largest Number");
			}
			else if(b > a && b > c) {
				System.out.println(b + "is Largest Number");
			}
			else {
				System.out.println(c + "is Largest Number");
			}

			sc.close();
		}
	}
	public class Approch2{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number");
			int a = sc.nextInt();
			
			System.out.println("Enter the Second Number");
			int b = sc.nextInt();
			
			System.out.println("Enter the Third Number");
			int c = sc.nextInt();
			
			//int largest1 = a > b ? a : b;                 // largest of a & b 
			//int largest2 = c > largest1 ? c : largest1;   // largest of c & largest 1
			
			
			// Above 2 condition convert into 1 condition
			
			int largest = c > (a>b ? a : b) ? c : (a>b ? a : b);
			
			System.out.println(largest + "is largest Number");
			sc.close();
		}
	}
}