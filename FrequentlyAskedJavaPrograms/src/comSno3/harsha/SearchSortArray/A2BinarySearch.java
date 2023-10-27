package comSno3.harsha.SearchSortArray;

import java.util.Arrays;

public class A2BinarySearch {
	public class UsingAlgoritham{
		public static void main(String[] args) {
			int a[] = {1,2,3,4,5,6,7,8,9,10};
			boolean flag = false;
			int key = 11;
			int l = 0;
			int h = a.length-1;
			
			while(l<=h) {
				int m = (l+h)/2;
				
				if(key == a[m]) {
					System.out.println("Element Found..");
					flag = true;
					break;
				}
				if(key < a[m]) {
					h = m -1;
				}
				if(key > a[m]) {
					l = m +1;
				}
				
			}
			if(flag ==false) {
				System.out.println("Element Not found");
			}
		}
	}
	public class Approach2{
		public static void main(String[] args) {
			int a[] = {1,2,3,4,5,6,7,8,9,10};
			System.out.println("Element found at :" + Arrays.binarySearch(a, 8));  
		}
	}
}
