package class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// create a program to ask user add name and store it in a variable.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please add your name");
		
		String name = scan.next();
		String midName = scan.next();
		String lastName = scan.next();
		
		System.out.println("Your name is "+name +" "+ midName +" "+ lastName);
		
		System.out.println("========================================");
		
		/* 
		 * YOU ARE A LOAN SPECIALIST AND YOU NEED TO
		 * ASK USER WHAT IS THE AMOUNT OF LOAN IS NEEDED. 
		 * IF LOAN IS LESS THAN 200,000 THEN YOU WOULD LEND THE MONEY OTHERWISE YOU WOULD REJECT THE CLIENT.
		*/
		
		System.out.println("Please tell use what amout of load do you need? add it in number");
		
		int loan=scan.nextInt();
		if (loan<=200000) {
			System.out.println("Congratulations! you are eligible for loan");
			
		}else {
			System.out.println("sorry! we can not loan you more loan");
			
		}

	}

}
