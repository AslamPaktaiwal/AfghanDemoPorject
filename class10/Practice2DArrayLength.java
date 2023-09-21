package class10;

public class Practice2DArrayLength {

	public static void main(String[] args) {

		String [] [] countries= {
				{"Afghanistan", "Iran", "Japan"},
				{"German", "English", "France", "Italy"},
				{"USA", "Canada", "Mixico", "Brazil", "West indies"}
		};
		
			System.out.println("The row numbers"+ countries.length);
			System.out.println("First row elements"+ countries[0]. length);
			System.out.println("Second row elements"+ countries[1]. length);
			System.out.println("Third row elements"+ countries[2]. length);
			
			for (int r=0; r<countries.length; r++) {

				for (int c=0; c<countries[r].length; c++) {
					
					System.out.print(countries[r][c]+" ");
				}
		}
			
			System.out.println();
			System.out.println("====== print sd array element use for each loop");
			
			for (String [] country:countries) {
				
				for (String c: country) {
					
					System.out.print(c+ " ** ");
				}
			}
	
	}
}

