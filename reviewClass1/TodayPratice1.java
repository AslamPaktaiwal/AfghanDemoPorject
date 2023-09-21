package reviewClass1;

public class TodayPratice1 {
	
	public static void main(String [] args) {
	
	 String name="Aslam khan"; 
	 String school="joincoretech";
	 System.out.println("My name is "+ name +" and i am "+ school +" Student");
	 
	 // create
	 
		String firstName="Aslam";
		String lastName="khan";
		String fullName= firstName+' '+lastName;
		int age=40;
		
		System.out.println("My name is "+ fullName +" and my age is "+age );
		
		// declare variable
		
		int num;
		num=5;
		
		int num2=num; // 5
		
		int num3=num2+num; // 5+5=10
		
		// we can declare many variable in the same time
		
		int num4, num5, num6;
		
		num4=10;
		num5=20;
		num6=num4;// 10
		System.out.println(num6);
		num6=num5;// 20
		System.out.println(num6);
		

	}
}