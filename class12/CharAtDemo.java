package class12;

public class CharAtDemo {

	public static void main(String[] args) {
		
		String student1="Samiullah is one of the Student";
		
		String name=" Afghanistan";
		
		char u= name.charAt(1);
		
		System.out.println(u);
		
		for (int i=name.length()-1; i>=0; i--) {
			
			char n= name.charAt(i);
			System.out.print(n);
		}
		
		// indexOF()
		
		System.out.println();
		String greeting="Good Morning";
		
		System.out.println(greeting.indexOf('M'));
		
	}

}
