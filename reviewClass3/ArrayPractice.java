package reviewClass3;

public class ArrayPractice {

	public static void main(String[] args) {
		
		
		// First we should mention type [] nameoffarray =new type [size]
		
		// type [] nameOfArray={ value1, value2,......);
		
		
		int [] num=new int [3];
		
		num[0]=5;
		num[1]=10;
		num[2]=15;

		System.out.println(num[2]);
		for (int n:num) {
			System.out.println(n);

		}
	
		
		String [] country= {"USA", "Canada", "Afghanistan", "Maxico"};
		
		for (int i=0; i<country.length; i++) {
			
			System.out.print(country[i]+ " ");
			
		}
		
		for (String str: country) {
			
			System.out.println(str);

		}
	}

}


