package class14HomeWork;

public class HomeWork3 {

	public static void main(String[] args) {

		/*
		 *   There is a code that takes input as a String. Write a program that will print
		 *   out only vowels of that string Sample input/outputs: In: howdyho oo
		 * 
		 *   In: huehuehuehue ueueueue
		 * 
		 *   In: poopoo what idk what im doing ooooaiaioi
		 */
		
	     String s= "howdyho";
	     for (int i = 0; i < s.length(); i++) 
	        			
	     if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
	        	                System.out.print(s.charAt(i));{
	      }
	     }
	     System.out.println();
	     String s1= "huehuehuehue";
	     for (int i = 0; i < s1.length(); i++) 
	        			
	     if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
	        	                System.out.print(s1.charAt(i));{
	      }
	     }
	     System.out.println();
		  String s2= "poopoo what idk what im doing";
		     for (int i = 0; i < s2.length(); i++) 
		        			
		     if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
		        	                System.out.print(s2.charAt(i));
	}

	}  
}
