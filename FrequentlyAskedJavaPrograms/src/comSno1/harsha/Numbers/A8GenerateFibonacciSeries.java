package comSno1.harsha.Numbers;
//A series of numbers in which each number(fibonacci number)is the sum of the two preceding numbers
public class A8GenerateFibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2 ); // 0 1
		for (int i = 2 ; i < 10; i++) {
			
			sum = n1 + n2; 
   /*
    *1stIteration 0 + 1 = 1 
    *2ndIteration 1 + 1 = 2
    *3rdIteration 1 + 2 = 3
    *4thIteration 2 + 3 = 5
    *5thIteration 3 + 5 = 8
    *6thIteration 5 + 8 = 13
    *7thIteration 8 + 13 = 21
    *8thIteration 13 + 21 = 34
    *     
    */
			
			System.out.print(" " + sum); //1 2 3 5 8 13 21 34
			
			n1 = n2;
			n2 = sum;
		}
	}
	
}
