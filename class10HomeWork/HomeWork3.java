package class10HomeWork;

public class HomeWork3 {

	public static void main(String[] args) {
		
		/*	Write a program that creates an array with the following values{r, j, y, b, n, c, o, d, o, e, i}
		 * Print the values so the output should look like below
		 * Output:		joincore
		 */	
        char[] charArray = new char[]{'j', 'o', 'i', 'n','c','o', 'r', 'e'};
        
        //Create a new String object and pass the char array to the constructor
        String str = new String(charArray);
        
        //Printing the string after conversion
        System.out.println(str);
    }
}
