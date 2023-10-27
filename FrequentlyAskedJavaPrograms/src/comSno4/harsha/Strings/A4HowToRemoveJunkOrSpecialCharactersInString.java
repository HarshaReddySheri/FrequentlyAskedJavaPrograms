package comSno4.harsha.Strings;

public class A4HowToRemoveJunkOrSpecialCharactersInString {
	public static void main(String[] args) {
		String s = "`^)*#$%+##latin String ~`! @#$%^&*()-_+={}[]|\\;:\"<>,./? \"`^)*#$%+## 0123456789";
		String s1 ="@#$@#$@ testing @#$@#$#@#$ Selenium ~`! @#$%^&*()-_+={}[]|\\;:\"<>,./?  &&& Java";
		
		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);
		s1 = s1.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s1);
	}
}
