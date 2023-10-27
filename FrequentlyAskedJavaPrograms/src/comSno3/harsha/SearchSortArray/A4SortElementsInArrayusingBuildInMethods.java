package comSno3.harsha.SearchSortArray;

import java.util.Arrays;
import java.util.Collections;

public class A4SortElementsInArrayusingBuildInMethods {
	public class Approach1ParallelSort{
		public static void main(String[] args) {
			int a[] = {30,50,20,10,60};
			System.out.println("Array elements before sorting: " + Arrays.toString(a));

			Arrays.parallelSort(a);

			System.out.println("Array elements After sorting: " + Arrays.toString(a));
		}
	}
	public class Approach2Sort{
		public static void main(String[] args) {
			int a[] = {30,50,20,10,60};
			System.out.println("Array elements before sorting: " + Arrays.toString(a));

			Arrays.sort(a);

			System.out.println("Array elements After sorting: " + Arrays.toString(a));
		}
	}
	public class Approach3UsingCollectionreverseOrder{
		public static void main(String[] args) {
			
			//Reverse DescendingOrder
			Integer a[] = {30,50,20,10,60};
			System.out.println("Array elements before sorting: " + Arrays.toString(a));

			Arrays.sort(a,Collections.reverseOrder());

			System.out.println("Array elements After sorting: " + Arrays.toString(a));
		}
	}
}
