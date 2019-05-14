
public class StringComparison {

	public static void main(String[] args) {
		String firststring = "first";
		String secondstring = "second";
		
		//StringComparison sc = new StringComparison();
		
		String biggerstring = returnBiggerString(firststring,secondstring);
		
		System.out.println("Bigger String is: " +biggerstring);
	}
	
	public static String returnBiggerString(String s1, String s2) {
		if(s1.length()>s2.length()) {
			return s1;
		}
		else if(s2.length() > s1.length()) {
			return s2;
		}
		else {
			System.out.println("Both Strings are equal in length.");
			return "Both Strings are Equal";
		}
	}

}
