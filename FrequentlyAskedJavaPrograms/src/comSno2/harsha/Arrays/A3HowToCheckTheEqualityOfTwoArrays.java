package comSno2.harsha.Arrays;

import java.util.Arrays;

public class A3HowToCheckTheEqualityOfTwoArrays {
	public class Approach1{
		public static void main(String[] args) {
			int a1 [] = {1,2,10,4,5};
			int a2 [] = {1,2,3,4,5 };
			
			boolean status = Arrays.equals(a1, a2);
			
			if(status == true)
				System.out.println("Arrays are Equal");
			
			else
				System.out.println("Arrays are NotEqual");
			
 		}
	}
	public class Approach2{
		public static void main(String[] args) {
			int a1 [] = {1,2,10,4,5};
			int a2 [] = {1,2,3,4,5 };
			
			boolean status = true;
			if(a1.length == a2.length) {
				for (int i = 0; i < a1.length; i++) {
					if(a1[i] != a2[i]) {
						status = false;
					}
				}
			}
			else {
				status = false;
			}
			
			if (status == true) {
				System.out.println("Arrays are Equal");
			}
			else {
				System.out.println("Arrays are Not Equal");
			}
				
		}
	}
}
