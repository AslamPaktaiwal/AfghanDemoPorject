package class13;

public class ToCharArrayPractice {

	
	public static void main(String[] args) {

		
		String str1= "I love to have a good job";
		
		char [] array= str1.toCharArray(); // {'I', '1', ........}
				
		System.out.println(array.length);
		
		String count="";
	
		for (char n: array) {
			
			if (n=='v') {
				
				count+= 'f';
				continue;
			}
			count+=n;
			
			}
		
		// reverse the string
		
		System.out.println(count);
		
		for (int i=array.length-1; i>=0; i--) {
			
			System.out.print(array[i]);	
		}

	}
}
