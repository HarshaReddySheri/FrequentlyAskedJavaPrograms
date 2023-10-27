package comSno1.harsha.Numbers;

public class A1SwapTwoNumbersIn5Ways {
	public class UsingThirdVariable{
		public static void main(String[] args) {
			System.out.println("logic:1 --> Third variable");
			int a = 10, b = 20;
			System.out.println("Before swapping values are..." + a + " " + b);

			//logic:1 --> Third variable

			int t = a;
			a = b;
			b = t;
			System.out.println("After swapping values are..." + a + " " + b);


			/*
			 * Explanation
			 * ===========
			 * 10		  20
			 * a --> t --> b --> a 
			 * 	 1     3     2
			 * 
			 * t = a -> t = 10
			 * a = b -> a = 20
			 * b = t -> b = 10
			 * 
			 * final result
			 * a = 20 
			 * b = 10
			 * 
			 */


		}
	}
	public class WithoutUsingThirdVariableInsteadUseAddition_Subtration{
		public static void main(String[] args) {
			System.out.println("logic-2 use + and - operator without using third variable here a & b values should not be Zero");
			int a = 10, b = 20;
			System.out.println("Before swapping values are..." + a + " " + b);
			//logic-2 use + and - operator without using third variable here a & b values should not be Zero
			a = a + b;  //10 + 20 = 30
			b = a - b;  //30 - 20 = 10
			a = a - b;	//30 - 10 = 20
			System.out.println("After swapping values are..." + a + " " + b);


		}
	}

	public class WithoutUsingThirdVariableInsteadUseMultiple_division{
		public static void main(String[] args) {
			System.out.println("logic-3 use * and / operator without using third variable here a & b values should not be Zero");
			int a = 10, b = 20;
			System.out.println("Before swapping values are..." + a + " " + b);
			//logic-3 use * and / operator without using third variable here a & b values should not be Zero

			a = a * b;  //10 * 20 = 200
			b = a / b;  //200 / 20 = 10
			a = a / b;	//200 / 10 = 20

			System.out.println("After swapping values are..." + a + " " + b);


		}
	}

	public class WithoutUsingThirdVariableInsteadUseBitwiseXor {
		public static void main(String[] args) {
			System.out.println("Logic-4 using Bitwise Xor");
			int a = 10, b = 20;
			System.out.println("Before swapping values are..." + a + " " + b);

			//Logic 4 - bitwise Xor(^)

			a = a ^ b;  //10 ^ 20 = 30
			b = a ^ b;  //30 ^ 20 = 10
			a = a ^ b;  //30 ^ 10 = 20

			/*
			 * Explanation
			 * 
			 * bcd code --> 16,8,4,2,1
			 * 
			 * a = 10 -------> 1010-0 --> no corresponding value that treat zero
			 * b = 20 -------> 10100  --> if both are same result is one
			 * 
			 * a ^ b --------> 11110 ---> 30 -> Convert binary to Decimal 
			 * 
			 */
			System.out.println("After swapping values are ..." + a + " " + b);
		}

	}
	public class WithoutUsingThirdVariableInsteadUseSingleStatement{
		public static void main(String[] args) {
			System.out.println("Logic-5 using single statement");
			int a = 10, b = 20;
			System.out.println("Before swapping values are..." + a + " " + b);
			//single Statement
			b = a + b - (a = b);
			//  b = 30 - 20
			//	b = 10
			//  a = 20

			System.out.println("After swapping values are..." + a + " " + b);


		}
	}
}


