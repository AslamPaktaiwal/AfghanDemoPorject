package class04;

public class FindLargestNumber {

	public static void main(String[] args) {
		/*
		 * Write a program to ﬁnd largest of three double values using if-else.. if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		double num1= 32;
		double num2= 25;
		double num3= 20;
		
		if (num1>num2 && num2>num3) {
			System.out.println ("The largest number is "+num1);
			
		}else if (num2>num3) {
				System.out.println ("The largest number is "+num2);
				
		}else {
			System.out.println ("The largest number is "+num3);
		}
	}

}
