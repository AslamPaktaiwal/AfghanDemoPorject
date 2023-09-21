package class06;

import java.util.Scanner;

public class DowhileAndWhileLoop {

	public static void main(String[] args) {

		
		Scanner input=new Scanner (System.in);
		
		int num=0;
		
		int lotteryWinNumber=17;
		
		/*
		 * 
		 */

		while(num!=lotteryWinNumber) {
			
			System.out.println("Please add a number from 1-100 to win your lottery");
			num=input.nextInt();
			
		}
		
		System.out.println("Congratulation! Your are the winner");
		
		}
}
