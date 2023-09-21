package class09HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a for loop that will print out a series of numbers starting at 0 and
		 * ending at the doubled value of end (value must be taken from a user),
		 * exclusive. Each number should be on the same line, separated by a space.
		 * Example Output:  Int: 5 	0 1 2 3 4 5 6 7 8 9 Int: 8 	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		 * 					In: -5 (no output)
		 */
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // size of array 5

		System.out.println("========================= Int " + (numbers.length) / 2);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		int[] num1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13, 14, 15 }; // size of array 8

		System.out.println("========================= Int " + (num1.length) / 2);
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		
		System.out.println();
		int[] num2 = { 0,0,0,0,0}; // size of array -5

		System.out.println("========================= Int " + (-num2.length));
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}
}
