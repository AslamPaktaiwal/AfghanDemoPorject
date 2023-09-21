package class04HomeWork;

import java.util.Scanner;

public class HomeWork1 {
	
	public static void main(String[] args) {
	
	/*
	 * Write a program that takes user's first name and last name and prints in console
	 * Instruct the user to enter first name: "Please Enter First Name"
	 * Capture the first name
	 * Instruct the user to enter last name:"Please Enter Last Name"
	 * Capture last name
	 * Print first name and last name
	 * Final Output:	Example:Please Enter First Name
	 * 							Please Enter Last Name
	 * 						Cindy Crawford
	 */
		Scanner scan1=new Scanner (System.in);
		System.out.println("Please enter First name");
		
		String fistName = scan1.next();
		
		Scanner scan2=new Scanner (System.in);
		System.out.println("Please enter Last name");
		
		String lastName = scan2.next();
		
		System.out.println("========================================");
		
		System.out.println("Your name is "+fistName +" "+ lastName);
		

	}
}
