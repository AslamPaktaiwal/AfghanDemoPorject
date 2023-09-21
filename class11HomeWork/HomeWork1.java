package class11HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		
		/*
		 * Using the following array. {45, 78, 12, 67, 55, 89, 23, 77, 88} 
		 * Create a for loop to extract values from that array so your output looks as below:
		 * Expected Output:** 78 55 77 
		 * Note: Find out what is the start point and how much you need to increment to get the result.
		 */
		
	       //initialize array
	       int[] arr = {45, 78, 12, 67, 55, 89, 23, 77, 88};

	       //array length
	       int n = arr.length;

	        // loop through the array and increment by 2
	       for(int i=1; i< n; i=i+3){
	         //print element
	         System.out.print(" "+(arr[i]));
	       }
	    }
	}


