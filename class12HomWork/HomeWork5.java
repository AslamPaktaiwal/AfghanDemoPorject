package class12HomWork;

public class HomeWork5 {

	public static void main(String[] args) {

		/*
		 * 	Create a String given="I love Java classes at JoinCore"
		 * 	Retrieve 2 Strings from given String and print them
		 * 	Expected Output:	classes at JoinCore
		 * 	I love Java
		 */
		
		String str1= "I love Java classes at JoinCore";
		System.out.println(str1.substring(12));
		
		String str2= "I love Java classes at JoinCore";
		System.out.println(str2.substring(0,11));
	}


}
