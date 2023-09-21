package class11HomeWork;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*	Write a program that creates a String array with size 7.
	/	Ask the user to input Days of a week beginning with Sunday using Scanner class.
	/	Add these inputs to your array and then print all values from that array
	/	Example:
	/	Please enter day 1 of the week
	/	Sunday
	/	Please enter day 2 of the week
	/	Monday
	/	Please enter day 3 of the week
	/	Tuesday etc
	/	Example Output:
	/	Please enter day 1 of the week
	/	Sunday
	/	Please enter day 2 of the week
	/	Monday
	/	Please enter day 3 of the week
	/	Tuesday
	/	Please enter day 4 of the week
	/	Wednesday
	/	Please enter day 5 of the week
	/	Thursday
	/	Please enter day 6 of the week
	/	Friday
	/	Please enter day 7 of the week
	/	Saturday
	/	Sunday
	/	Monday
	/	Tuesday
	/	Wednesday
	/	Thursday
	/	Friday
	/	Saturday
	*/
		
	        Scanner in = new Scanner(System.in);
	        System.out.println("Please enter day 1 of the week: ");
	      
	        int day = in.nextInt();

	        System.out.println(getDayName(day));
	    }

	    // Get the name for the Week
	    public static String getDayName(int day) {
	        String dayName = "";
	        switch (day) {
	        
	        	case 1: dayName = "Sunday"; break;
	        	case 2: dayName = "Monday"; break;
	            case 3: dayName = "Tuesday"; break;
	            case 4: dayName = "Wednesday"; break;
	            case 5: dayName = "Thursday"; break;
	            case 6: dayName = "Friday"; break;
	            case 7: dayName = "Saturday"; break;
	            default:dayName = "Invalid day range";
	        }

	        return dayName;
	    }
	}
	
