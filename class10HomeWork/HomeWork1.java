package class10HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates an array of integers and stores the following
		 * values: 45, 78, 12, 67, 55 and then prints all array values.
		 */

		int[] numbers = { 45, 78, 12, 67, 55 }; // 

		System.out.println("The size of array is " + numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}

	}

}