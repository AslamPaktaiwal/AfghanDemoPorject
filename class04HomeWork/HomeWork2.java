package class04HomeWork;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*
		Write a program that asks the user's age: "Enter your age "
		Then display it by adding 10 (i.e age + 10) in your final output.
		Example Output:
		Enter your age 30
		Your age after 10 years is 40
		 */
		
		Scanner scan1=new Scanner (System.in);
		System.out.print("Enter your age ");
		
		int num1=30;
		int num2=10;
		int sum = num1+num2;
		
		String age= scan1.next();
		System.out.println("Your age after 10 years is "+sum);
		
		}
	}
