package class14HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		

		/*
		 * Create an array of names that will hold 5 String elements. Names must be
		 * taking from a user. Print out the first three characters of each element of
		 * the array, one per line. Note: every array element must be at least 3
		 * characters long. Input Example: 		John Jane Jimmy Mike Emily 
		 * 					Expected Output:	Joh Jan Jim Mik Emi
		 */

		String[] arr = {"John", "Jane", "Jimmy", "Mik", "Emi"};

		  for(String s : arr) {
		      String first3Chars = s.substring(0, 3);
		      
		      System.out.println(first3Chars);  
		  
		}
	}	
}
	
