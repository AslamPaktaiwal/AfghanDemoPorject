package class13;

public class MakeStringMutable {

	public static void main(String[] args) {
		
		// String is immutable we can not change the value in the heap
		
		String string="Hello";
		
		string = string.concat(" there");
		
		System.out.println(string);
		
		StringBuilder str1=new StringBuilder(string);
		str1.reverse();
		string=str1.toString();
		System.out.println(string);
		
		StringBuilder str2=new StringBuilder("Java");
		
		System.out.println(str2.reverse());
		System.out.println(str2.replace(0, 4, "home"));

		

	}

}
