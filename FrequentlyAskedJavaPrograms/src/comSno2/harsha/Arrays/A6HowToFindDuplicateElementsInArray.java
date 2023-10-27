package comSno2.harsha.Arrays;

import java.util.HashSet;

public class A6HowToFindDuplicateElementsInArray {
	
	public class Approach1{
		public static void main(String[] args) {
			String arr[] = {"java","c","c++","python","java"};
			
			boolean flag = false;
			for(int i= 0; i<arr.length; i++) {
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						System.out.println("Found Duplicate Elements :" + arr[i]);
						flag = true;
					}
				}
			}
			if(flag == false) {
				System.out.println("Duplicate Element not found");
			}
		}
	}
	public class Approach2{
		public static void main(String[] args) {
			String arr[] = {"java","c","c++","python","java"};
			//HashSet(unique) will not allow the duplicates 
			HashSet<String> langs = new HashSet<String>();
			
			boolean flag = false;
			for(String l : arr) {
				if(langs.add(l) == false) { // While adding duplicates is found it become false 
					System.out.println("Found Duplicates Elements: " + l);
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Not found Duplicates");
			}
		}
	}
}
