package class07HomeWork;

public class HomeWork4 {

	public static void main(String[] args) {

		/*
		 * Step 1: Initialize the i value as int i=7.
		 * Step 2: Write a program to print a sequence of numbers starting from 7 to 98
		 */
		
		
		int number=1;

		do {	// do while loop run the code first then check the condition.
			System.out.println("I value as int i=7");
			number--;
		} while (number>100);
		
		
		int num=1; 	//print only even number till 20
		
		while (num<=100) {
			if (num%7==0) {
				
				System.out.print(num+ " ");
			}
			num++;
		}
			System.out.println("... ");
			
	}
}
