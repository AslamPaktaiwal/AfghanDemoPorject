package reviewClass3;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		
		//	 Loop : in java loop is helping us to avoid code repetition and print a block of code as many time as we want
		
		//	 while loop : check condition first then run
		//	 do While loop : run first then check condition
		
		//	 for loop: it is better to use for loop if we know the number of repetition.
		//	 advance/enhance loop : we use advance loop to get array elements.
		
		int temp=74;
		
		Boolean status= true;
while (status) {
	System.out.println(" Weather no warm enough to go out");
	if (temp==75) {
		System.out.println(" Weatheris nice i will go out for walking");
		status=false;
	}
	temp++;
}

int day=1;
boolean dayStatus=true;
do {
	if (day==5) {
		System.out.println(" "+ day+ " The day is Friday we will not have a class");
		dayStatus=false;
	}
	day++;
}while (dayStatus);
	}

}
