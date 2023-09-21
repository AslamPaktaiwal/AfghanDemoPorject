package class06HomeWork;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		/*
		 * Prompt user with questions: "Please enter your favorite car make" if user
		 * enters BMW --> carOrigin = "german car" 
		 * if user enters Toyota --> carOrigin = " japanes car" 
		 * if user enters Maserati --> carOrigin = "italian car"
		 * anything else besides those values --> carOrigin = "unknown" 
		 * The output of your program should be: "Your favorite car is ___"
		 */
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter your favorite car make");
		String carOrigin=input.nextLine();
		
	switch (carOrigin) {
		case "BMW":
			System.out.println("Your favorite car is: German car");
			break;
		case "Toyota":
			System.out.println("Your favorite car is: Japanes car");
			break;
		case "Maserati":
			System.out.println("Your favorite car is: Italian car");
			break;
		default:
			System.out.println("Your favorite car is: unknown");
			break;
		}
	}

}
