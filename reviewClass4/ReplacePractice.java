package reviewClass4;

public class ReplacePractice {

	public static void main(String[] args) {
		
		
		
		String num="aasfjffAKJAFKFKA12849527338573^%$@@";
				
		System.out.println(num.replaceAll("[^0-9]", "")); //only number will stay
		
		System.out.println(num.replaceAll("[^a-zA-Z]", ""));
		
		String name="Joincoretech";
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		
		for (int i=name.length()-1; i>=0; i--) {
			
			System.out.print(name.charAt(i));
			
		}
		char [] arr=name.toCharArray();
		
		System.out.println();
		int num1=0;
		for (int i=arr.length-1; i>=0; i--) {
			
			if (arr[i]=='c' || arr[i]=='c') {
				
				num1++;
				
			}
			System.out.print(arr[i]);
			
			}
		System.out.println();
			System.out.println("there are "+ num1+" in the" +name);

	}

}
