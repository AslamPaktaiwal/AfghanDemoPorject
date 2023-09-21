package class04HomeWork;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

	/*
	 * Create a program that will ask a user to input boolean value "Input the boolean value"
	 * If the input is true or false, then the output should look like below:
	 * Example Output:	Input the boolean value
	 * 					The value is true
	 * Example Output:	Input the boolean value
	 * 					The value is false
	*/
			
		Scanner input=new Scanner (System.in);
		System.out.println("Input the boolean value");
		
		boolean creditCard=input.nextBoolean();
		
		if(creditCard)  {
			System.out.println("The value is true");
		}else {
			System.out.println("The value is false");
	}
		
	}
}
