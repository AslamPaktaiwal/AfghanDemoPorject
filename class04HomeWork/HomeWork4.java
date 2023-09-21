package class04HomeWork;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		/*
		Write a program to take values of length and width from the user.
		Based on value define whether the shape is a square or rectangle.
		Examples:
		Please enter the length 18
		Please enter the width 16
		The shape of your object is rectangle

		Please enter the length 16
		Please enter the width 16
		The shape of your object is square
		*/
	// perimeter formula P=2(L.W) so we can write...
	// Length formula (P=(L.W) so we can write...

		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Object Length ");
		int num1=scanner.nextInt();
		
		System.out.print("Object Width ");
		int num2=scanner.nextInt();

		System.out.print("The formula of Rectangle perimeter is P=2(L.w)");
		
		char sign=scanner.next().charAt(0);

		if (sign=='*') {
			System.out.print("The rectangle perimeter is "+ num1*num2*2);

		}else {
			System.out.println("Sorry the program does not support this action");
			
		}

	}

}
