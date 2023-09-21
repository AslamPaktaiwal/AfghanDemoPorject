package class05;

import java.util.Scanner;

public class FindLargeNumberNestedIf {

	public static void main(String[] args) {
/*
 * Program to find the largest number
 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Please add three different numbers to find the largest one");
		
		int number1=scan.nextInt();
		System.out.println("Please add second numbers");
		
		int number2=scan.nextInt();
		System.out.println("Please add third number");
		
		int number3 = scan.nextInt();
		
		if (number1> number2 ) {
			
			if (number2> number3) {
				
				System.out.println("The largest number is " + number1);
				
			}else if (number2>number3) {
				
				System.out.println("The largest number is " + number2);
						
			}else {
				System.out.println("The largest number is " + number3);
			

			}
		}
		
	}

}
