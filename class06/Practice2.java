package class06;

public class Practice2 {

	public static void main(String[] args) {

		//	create a program that print number from 1-5 use while loop
		
		
		
		
		
		//ctrl+shft+/	|| or
		
		boolean workDay=true;
		
		int day=1;
		
		while (workDay==true) {
			
			System.out.println("I need a day off");
			day++;
			
			if (day==6 || day==7) {
				System.out.println("I do not need day off");
				workDay=false;
			}
		}
	}	
}		
			