package class12HomWork;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Create a String named s1 = "hello" check weather string is empty or not
		 * Create a String named s2 = "" check weather string is empty or not
			Expected Output:
			**false**
			***true**
		 */
		
		String blankString = "";

		if (blankString == null || blankString.length() == 0)
		    System.out.println("false");
		else
		    System.out.println("true");

	String blankString1 = "hello";

	if (blankString1 == null || blankString1.length() == 0)
	    System.out.println("false");
	else
	    System.out.println("true");
		
	}
}
