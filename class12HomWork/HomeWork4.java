package class12HomWork;

public class HomeWork4 {

	public static void main(String[] args) {
		
		/*
		 * Print out the position of the first occurrence of "c".
		 * Print out the position of the first occurrence of " ".
		 * Print out the position of the first occurrence of the variable target1.
		 * Print out the position of the first occurrence of the variable target2.
		 Expected Output:	 4
							11
							 6
							-1
		 */

		// indexOF()
		
		String letter="Joincoretech is a unique online academy";
		System.out.println(letter.indexOf( 'c'));
		System.out.println(letter.indexOf(' '));
		System.out.println(letter.indexOf( 'r'));
		System.out.println(letter.indexOf('0'));
		
	}
}

