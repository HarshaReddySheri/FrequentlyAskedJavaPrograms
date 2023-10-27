package comSno4.harsha.Strings;

public class A5HOwToRemoveWhiteSpacesInAString {
	public static void main(String[] args) {
		String str = "Java programming selenium automation";
		
		System.out.println("Before removing the white spaces: " + str);
		str = str.replaceAll(" ", "");
		System.out.println("After removing the white space: " + str);
	}
}


