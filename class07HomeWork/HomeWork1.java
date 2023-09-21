package class07HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		
		/*
		 * Using do while loop print numbers from 10 to 20 
		 * Must not include the number 20 in the output
		 */

		int number=10;
		do {	// do while loop run the code first then check the condition.	
		number--;
			
		} while (number>20);
		
		int num=10;
		
		while (num<20) {
			if (num%1==0) {
				
				System.out.print(num+ " ");
			}
			num++;
		}
	}
}
