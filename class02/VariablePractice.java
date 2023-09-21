package class02;

public class VariablePractice {
	
	public static void main(String [] args) {
		
		
		String schoolName="JoinCoreTech";
		
		System.out.println(schoolName);
		
		// declare a variable then assign the value 10
		
		int num1;
		num1=10;
		
		// we can declare more than one variable in the same time
		
		int num2, num3, num4;
		
		num2=5;
		num3=15;
		num4=num3;
		
		// we can change the variable value, and display the last value; such as 20
		num2=20;
		
		System.out.println(num2);
		
		
		boolean isToDayFriday;
		isToDayFriday = false;
		
		boolean isToDaySunday;
		isToDaySunday = isToDayFriday;
				
		boolean isToDayWednesday = true;
		
		isToDayWednesday= true;
		
		String name="Masodi";
		String greeting= "Hello my name is ";
		
		System.out.println(greeting + name); 
		
		
	}

}
