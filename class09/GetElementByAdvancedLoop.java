package class09;

public class GetElementByAdvancedLoop {

	public static void main(String[] args) {

		int [] num= {10,20,30,25,5,15};
			
		// lets print all the array element by using the enhanced loop
		
		for (int n: num) {
			System.out.println(n+ " ");
		}
		
		System.out.println();
		for (int n: num) {
			if (n%2==0) {
				System.out.println(n+ " ");

			}
		}
		String [] names= {"Aslam", "Iqbal", "Samiullah", "Masoodi", "Nasratullah", "Meraj"};
		
		for (int i=1; i<names.length; i++) {
			
			System.out.println(names[1]+ " ");
			for (String name: names) {
				
				System.out.print(name+" ");
			}
			
		}
	}

}
