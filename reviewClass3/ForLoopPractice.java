package reviewClass3;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		//  Print "Hello" five time in one line with space
		
		for (int i=1; i <=5; i++) {
			
			System.out.print(i+" Hello ");
		}
		
		// Print number from 10 - 1 in one line with space
		
		System.out.println();
		for (int i=10; i >=1; i--) {
		System.out.print(i+" ");
		}
		
		// Print only even number from 1 - 20 in one line with space
	
		System.out.println();
			
		for (int i=1; i <=20; i++) {		
		if (i%2==0) {
			System.out.print(i+ " ");

			}
		}
	}
}

