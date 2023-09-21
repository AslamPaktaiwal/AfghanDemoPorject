package class05;

import java.util.Scanner;

public class SwitchPractice2 {

	private static Scanner scanner;
	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Not good enough, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * Note: The print letter should be on upper case
		 */

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please add your grade I=in upper case letter");
		char grade= scanner.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
		System.out.println("Excellent");
		break;
		
		case 'B':
		System.out.println("Good");
		break;
	
		case 'C':
		System.out.println("Average");
		break;
		
		case 'D':
		System.out.println("Not good enough");
		break;
		
		default:
			System.out.println("not acceptable");
		}		
	
	}
}
