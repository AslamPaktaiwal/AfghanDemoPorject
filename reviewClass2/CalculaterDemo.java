package reviewClass2;

import java.util.Scanner;

public class CalculaterDemo {

	public static void main(String[] args) {

		// let ask a costumer to enter two numbers and operation sign program will return the result
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please add your first number");
		int num1=scanner.nextInt();
		
		System.out.println("Please add your second number");
		int num2=scanner.nextInt();

		System.out.println("Please add one of the operators (+, -, /, *)");
		
		char sign=scanner.next().charAt(0);
		
		if (sign=='+') {
			System.out.println("Sum of your numbers is "+ (num1+num2));

		}else if (sign=='-') {
			System.out.println("Sum of your numbers is "+ (num1-num2)); // to know the system it is not concatenation.  
			
		}else if (sign=='*') {
			System.out.println("Multi of your numbers is "+ num1*num2);
			
		}else if (sign=='/') {
			System.out.println("Div of your numbers is "+ num1/num2);
			
		}else {
			System.out.println("Sorry the program does not support this action");
			
		}

	}

}
