package comSno3.harsha.SearchSortArray;

import java.util.Arrays;

public class A3BubbleSort { //BubbleSortLogic = index comparing + swapping
	public static void main(String[] args) {
		int a[] = {30,50,20,10,60};
		System.out.println("Array elements before sorting: " + Arrays.toString(a));
		int n = a.length-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
		System.out.println("Array elements After sorting: " + Arrays.toString(a));
		
	}
}
