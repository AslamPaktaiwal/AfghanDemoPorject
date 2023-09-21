package class14HomeWork;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Given the following inputs: String s; Write a for loop that will print out
		 * each letter of the string s, separated by spaces, on the same line. Sample
		 * input/outputs: 	In: hello h e l l o
		 * 
		 * 					In: covert c o v e r t
		 * 
		 * 					In: blasphemy b l a s p h e m y
		 */

		StringBuilder word1 = new StringBuilder("hello");
		for (int i=1; i<word1.length(); i+=2)
		    word1.insert(i, ' ');
		System.out.println(word1.toString());
		
		StringBuilder word2 = new StringBuilder("convert");
		for (int i=1; i<word2.length(); i+=2)
			word2.insert(i, ' ');
		System.out.println(word2.toString());
		
		StringBuilder word3 = new StringBuilder("blasphemy");
		for (int i=1; i<word3.length(); i+=2)
			word3.insert(i, ' ');
		System.out.println(word3.toString());
	}

}
