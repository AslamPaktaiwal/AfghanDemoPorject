package class10;

public class LargeNumberInArray {

	public static void main(String[] args) {

		int[] number = { 105, 15, 20, 100, 101 };

		int large = 0;

		for (int num : number) {

			if (large < num) {

				large = num;

			}
		}

		System.out.println("The largest element in Array is " + large);
		
		// my work

	int smallest=number[0];

	for( int num:number) {

		if (smallest > num) {

			smallest = num;
		}
	}
	
	System.out.println("The Smallest element in Array is " + smallest);

	// Find small number in array
	
		int small=number[0];
		for (int num: number) {
		if (small>num) {
			small = num;
		
		}
	}
			
			System.out.println("The Smallest element in Array is " + small);
}
}