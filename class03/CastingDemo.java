package class03;

public class CastingDemo {

	public static void main(String[] args) {
		
		// casting we add one type of value to another type
		
		int num1 =2;
		
		double num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = (int) num2;
		System.out.println(num1);
		
		// widening casting (implicit / automatic casting) - convert the smaller type data to bigger one
		
		int num3 = 30;
		
		float num4 = num3;
		
		System.out.println(num4);
		
		// narrowing casting ( explicit/ manual) - convert bigger data type to smaller one
		
		num3= (int) num4;
		System.out.println(num3);
		
	}

}
