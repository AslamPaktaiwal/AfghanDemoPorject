package class06HomeWork;

import java.util.Scanner;

public class HomeWork1 {
	
	public static void main(String[] args) {
		
		/*
		 * By using the switch statement concept please validate what is the responsibility each instructor in the joincoretech.
		 * First Output: "Enter name of the instructor"
		 * case 1: if User provided the name as Azizullah as input it should show  "Will take care of Java Assignment"
		 * case 2: if User provided the name as Ehsanullah as input it should show  "Will take care of SDLC Assignment"
		 * case 3: if User provided the name as Hemat as input it should show  "Will take care of every Assignment"
		 * Other than these four names if the user provides any other names --> " Invalid instructor selected"
		 */
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter name of the instructor");
		String intructorName=input.nextLine();
		
	switch (intructorName) {
		case "Azizullah":
			System.out.println("Will take care of Java Assignment");
			break;
		case "Ihsanullah":
			System.out.println("Will take care of SDLC Assignment");
			break;
		case "Abdul Karim":
			System.out.println("Will take care of every Assignment");
			break;
		default:
			System.out.println("Invalid instructor selected");
			break;
		}
	}
}
		