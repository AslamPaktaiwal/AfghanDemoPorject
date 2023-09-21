package class08HomeWork;

public class HomeWork3 {

	public static void main(String[] args) {

		/*	Given the following inputs:
		 * int x;
		 * Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
		 * Example Output:
		 */
		
		int [] numbers= {0, 1, 2,}; // size of array 3
					//   0, 1, 2,

		System.out.println("The size of array is "+ numbers.length);
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");	
			
		}
		System.out.println();
		int [] num1= {0, 1, 2,3,4,5,6,7}; // size of array 3

		System.out.println("The size of array is "+ num1.length);
		for (int i=0; i<num1.length; i++) {
			System.out.print(num1[i]+ " ");	
			
		}
		System.out.println();
		int [] num2= {0, 1, 2,3,4}; // size of array 3

		System.out.println("The size of array is "+ num2.length);
		for (int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+ " ");	

}
	}
}
