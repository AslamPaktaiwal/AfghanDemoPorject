package class07HomeWork;

public class HomeWork2 {

	
	public static void main(String[] args) {

		/*
		 * Create a do while loop that prints out "Hello World!" 5 times. Output: 
		 * Hello Joincoretech! 
		 * Hello Joincoretech! 
		 * Hello Joincoretech! 
		 * Hello Joincoretech!
		 * Hello Joincoretech!
		 */
		
		boolean hello=true;
		
		int day=1;
		while (hello==true) {
			
			System.out.println("Hello Joincoretech!");
			day++;
			
			if (day==6) {
			hello=false;
			}
		}
		
	}
}
