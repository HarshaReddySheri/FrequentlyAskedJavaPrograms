package comSno2.harsha.Arrays;

public class A1FindSumOfElementsInArray {
	public class UsingForLoop{
		/*
		 * Sum of all elements of array
		 * 
		 *Array with 5 Elements
		 *Sum = a[0] + a[1} + a[2] + a[3] + a[4]
		 *    = 5    + 2    + 7		 9    + 6
		 *Sum = 29
		 *
		 */
		public static void main(String[] args) {
			int a[] = {5, 2, 7, 9, 6};
			int sum = 0;
			
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("Sum Of Array Elements:" + sum);
		}
	}
	public class UsingEnhancedForLoop{
		public static void main(String[] args) {
			int a[] = {5, 2, 7, 9, 6};
			int sum = 0;
			for(int value:a) {
				sum = sum + value;
			}
			System.out.println("Sum Of Array elements:" + sum);
		}
	}
}
