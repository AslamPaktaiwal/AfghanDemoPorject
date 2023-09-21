package class09HomeWork;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Using for loop Print 1 to 10 Numbers except 5 and 6 Expected Output:1 2 3 4 5
		 * 6 7 8 9 10 (Print in different line)
		 */

		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
	}

}
