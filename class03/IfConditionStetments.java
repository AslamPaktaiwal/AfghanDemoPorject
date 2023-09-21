package class03;

public class IfConditionStetments {

	public static void main(String[] args) {

		int a = 5;
		int b = 4;

		if (a > b) {
			System.out.println(a + " bigger than " + b);
		} else {
			System.out.println(a + " smaller than " + b);
		}

		
		System.out.println("--------------------------------------------");

		
		int temp = 30;

		if (temp <= 32) {
			System.out.println("I am not going out. the weather is freezing");
		} else {
			System.out.println("I will go out. the weather is fine");
		}

		System.out.println("--------------------------------------------");
		
		String study = "study hard";

		if (study == "study hard") {
			System.out.println("you will get a good 100k job");

		} else {
			System.out.println("It will be hard to get a good job");
		}

	}

}
