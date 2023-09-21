package class07;

public class Practice {

	public static void main(String[] args) {
		
		// Print the number from 1 - 100 in one line with space
		
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+ " ");		
		}

		System.out.println();
		// Print even numbers from 100-1
		for(int number=100; number>=1; number--) {
			
			System.out.print(number+ " ");		
		}
		
		System.out.println();	
		// Print even numbers from 20-1 (2 ways)
		
		for(int i=20; i>1; i-=2) {
		
			System.out.print(i+ " ");	
	}
		
		
			System.out.println();
			
			for(int i=20; i>1; i--) {
				
				if (i%2==0) {
					
					System.out.print(i+" ");	
				}		
			}
			
			System.out.println();
			System.out.println("=============Print odd numbers between 20 and 50 (2 ways)");
			
			for (int i=20; i<=50; i++)	{
				
				if (i%2!=0) {
					System.out.print(i+" ");
			}
		}
	}
}
