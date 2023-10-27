package comSno2.harsha.Arrays;

public class A2PrintEven_OddNumbersFromAnArray {
	public class ForLoop{
		public static void main(String[] args) {
			int a[ ] = {1,2,3,4,5,6};

			//Extracting even Number......
			System.out.println("Even Number in Array...");
			for(int i = 0; i < a.length ; i++) {
				if(a[i] % 2 == 0)
					System.out.println(a[i]);

			}

			//Extracting odd Number.......
			System.out.println("Odd Number in Array...");
			for(int i = 0; i< a.length; i++) {
				if(a[i]%2 != 0)
					System.out.println(a[i]);
			}

		}
	}
	public class EnhancedFor{
		public static void main(String[] args) {
			int a[ ] = {1,2,3,4,5,6};

			//Extracting even Number......
			System.out.println("Even Number in Array");
			for(int value : a) {
				if(value%2 ==0 )
					System.out.println(value);
				
			}
			//Extracting odd Number......
			System.out.println("Odd Number in Array");
			for(int value : a) {
				if(value%2 != 0)
					System.out.println(value);
					
			}
		}

	}
}
