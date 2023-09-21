package class05;

public class SwitchPractice3 {
	
	public static void main(String[] args) {
		
		int day= 2
				;
		String weekdays="";
		
		switch (day) {
		
		case 1:
			weekdays ="Monday";
			break;
			
		case 2:
			weekdays ="Tuesday";
			break;
			
		case 3:
			weekdays ="Wednesday";
			break;
			
		case 4:
			weekdays ="Thursday";
			break;
			
		case 5:
			weekdays ="Friday";
			break;
			
		case 6:
			weekdays ="Satuday";
			break;
			
		case 7:
			weekdays ="Sunday";
			break;
			
		default:
			System.out.println("invalid day");
		}
		
		System.out.println(day+ " = "+ weekdays);

	}

}
