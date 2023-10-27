package comSno2.harsha.Arrays;

public class A5HowToFIndMaximum_MinimumValuesInArray {
	
	public class MaxElementArray{
		public static void main(String[] args) {
			int a[] = {50,30,40,20,60};
			int max = a[0];
			
			for(int i = 1; i < a.length; i++) {
				if(a[i] > max)
					max = a[i];
			}
			System.out.println("Maximum Element is array is: " + max);
		}
	}
	public class MinElementArray{
		public static void main(String[] args) {
			int a[] = {50,30,40,20,60};
			int min = a[0];
			
			for(int i = 1; i < a.length; i++) {
				if(a[i] < min)
					min = a[i];
			}
			System.out.println("Minimum Element is array is: " + min);
		}
	}
}
