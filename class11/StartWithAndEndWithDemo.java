package class11;

public class StartWithAndEndWithDemo {

	public static void main(String[] args) {
		
		String thisIsString="that methods are only for you";
		
		System.out.println(thisIsString.startsWith("These methods are"));
		System.out.println(thisIsString.startsWith("T"));
		System.out.println(thisIsString.startsWith("This methods are"));
		
		if (thisIsString.startsWith ("This") || thisIsString.startsWith("That") 
				|| thisIsString.startsWith ("this") || thisIsString.startsWith("that")) 
		{
			
			System.out.println("The subject is singular");
		}else {
			System.out.println("The subject is plural");
		}
		
		//endsWith()
		
		}
	}

