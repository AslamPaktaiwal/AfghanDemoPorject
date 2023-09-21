package class03;

public class ElseIfConditionStatments {

	public static void main(String[] args) {

		double num1 = 10.15;
		double num2 = 10.25;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is bigger than " + num2);
		} else

		if (num1 < num2) {
			System.out.println("Double value " + num2 + " is bigger than " + num1);
		} else {

			System.out.println(num1 + " is equal to " + num2);
			
		}
		
		
		// we will create a program. if some one add number , the program will give back weekday.
		

		int day=8;
		
		
		if (day == 1) {
			
			System.out.println("Today is Monday");
			
		}else if (day == 2) {
			System.out.println("Today is Tuesday");			
		}else if (day == 3) {
				System.out.println("Today is Wednesday");	
		}else if (day == 4) {
			System.out.println("Today is Thursday");			
		}else if (day == 5) {
			System.out.println("Today is Friday");			
		}else if (day == 6) {
			System.out.println("Today is Saturday");			
		}else if (day == 7) {
			System.out.println("Today is Sunday");
		}else {
			System.out.println("The day is invalid");
		}
	}
}