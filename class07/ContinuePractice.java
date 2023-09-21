package class07;

public class ContinuePractice {

	public static void main(String[] args) {

		// Print numbers from 1-50 except
		// those that are divisible by 3
		
		for (int i=1; i<=50; i++) {

			if (i%3==0) {
				continue;	
		}
			System.out.print(i+ " ");

		// Print numbers from 50-100 except
			
	}
		System.out.println();
		
		for (int i=50; i<=100; i++) {

			if (i%5==0) {
				continue;	
		}
			System.out.print(i+ " ");
				
		}
	}
}