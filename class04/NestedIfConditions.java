package class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int age=33;
		
		if (age < 18) {
			
			System.out.println("You should have your father permission to work.");
		}else {
			
			System.out.println("CONGRATULATION!!! you are 18 or older.");
			if (age<64) {
				
				System.out.println("You are eligible for work.");

			}

		}
	}

}
