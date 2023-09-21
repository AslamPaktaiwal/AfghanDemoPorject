package class04;

public class LogicalOperators {

	public static void main(String[] args) {

		/*
		 * output for and (&&) operator
		 *  false && false = false
		 *  false && true = false
		 *  true && false = false
		 *  true && true = true
		 *  
		 */
		
		/*
		 * output for or (||) operator
		 *  false || false = false
		 *  false || true = false
		 *  true || false = false
		 *  true || true = true
		 *  
		 */
		
		 /*
		  * WRITE A PROGRAM THAT WILL PRINT WHETHER IT IS A WEEKEND OR WEEKDAY. IF ANY DAY 
		  * FROM 1-5 → OUTPUT "IT IS A WEEKDAY", ANYDAY FROM 6-7 → OUTPUT "IT IS A WEEKEND", 
		  * ANY OTHER DAY → OUTPUT "INVALID DAY"
		  */
		
		int day= 4;
		 
		 if (day>=1 && day<=5) {
			 System.out.println("It is weekday");
		
		 }else if (day>=6 && day<=7) {	 
			 System.out.println("It is a weekend");
		
		 }else {	 
			 System.out.println("Invalid day");
			 
		 }
				
	}

}
