package class10HomeWork;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45, 78, 12, 67, 55, 89, 23, 77, 88 Print only values that stored with
		 * even index including 0. Output: 45 12 55 23 88
		 */

		int[] numbers = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		System.out.println("The size of array is " + numbers.length);
		for (int i = 0; i < numbers.length; i+=2) {
			
			System.out.print(numbers[i] + " ");

		}
	}

}
