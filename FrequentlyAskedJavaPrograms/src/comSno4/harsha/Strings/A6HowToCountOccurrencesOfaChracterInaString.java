package comSno4.harsha.Strings;

public class A6HowToCountOccurrencesOfaChracterInaString {
	public static void main(String[] args) {
		String s = "Java Programming Java OOPs";
		int totalCount = s.length();
		int totalcount_afterRemove = s.replace("a", "").length();
		
		int count = totalCount - totalcount_afterRemove;
		System.out.println("Number Occurances of a is :" + count);
	}
}
