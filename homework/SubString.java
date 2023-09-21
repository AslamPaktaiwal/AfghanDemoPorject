package homework;

public class SubString {

	public static void main(String[] args) {


		String str = "Welcome  Kabul Afghansitan";
		System.out.print("Return Value :");
		System.out.println(str.substring(10));

		System.out.print("Return Value :");
		System.out.println(str.substring(10, 19));

		//

		String str1 = new String("Welcome to Zabul Afghansitan");
		System.out.print("Return Value :");
		System.out.println(str1.replace('Z', 'K'));

		System.out.print("Return Value :");
		System.out.println(str1.replace('e', 'a'));

	
	}

}
