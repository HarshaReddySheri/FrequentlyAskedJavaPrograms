package comSno1.harsha.Numbers;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class B1HowToGenerateRandomNumbers {
	public class Appaoch1{
		public static void main(String[] args) {
			Random rand = new Random();
			int rand_int = rand.nextInt(200);
			System.out.println(rand_int);		
		}
	}
	public class Approch1{
		public static void main(String[] args) {
			Random rand = new Random();
			double rand_db = rand.nextInt(50);
			System.out.println(rand_db);
			
		}
	}
	public class Approch2{
		public static void main(String[] args) {
			System.out.println(Math.random());
		}
	}
	public class Approach3{
		public static void main(String[] args) {
			String randNum = RandomStringUtils.randomNumeric(10);
			System.out.println(randNum);
			
		}
	}
}
