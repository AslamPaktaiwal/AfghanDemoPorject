package class04;

public class Practice2 {
	
	public static void main(String[] args) {

		
		/*
		 * Creat a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy 
		 * decides to buy a house, if price of the house is larger than 200000 than 
		 * user will take a loan, otherwise user will pay cash.
		 */
		
		
		double rate= 4.4;
		
		int price= 200000;
		
		if (rate > 4.5) {
			System.out.println("Rate is too high customer will not buy a house");
		}else {
			System.out.println("Rate is lower enough customer will buy a house");
			if (price >200000) {
				System.out.println("Customer will take loan");
			}else {
				System.out.print("Customer has enough money to buy a house");
			}
		}
	}
}

