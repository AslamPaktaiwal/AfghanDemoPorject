package class03;

public class ArithmaticOperator {

	public static void main(String[] args) {

		// Arithmetic operators: +,-, *, /,%,
		 
		// Addition(+), Subtraction(-), Multiplication(*), Modulus(%), Division(/)
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 + num2) ; // output: 15	
		System.out.println(num1 - num2) ; // output: 5
		System.out.println(num1 * num2) ; // output: 50
		System.out.println(num1 / num2) ; // output: 2
		System.out.println(num1 % num2) ; // output: 0
		
		// we can use variables to initialize other variables
		
		int sum = num1+num2;
		int sub = num1-num2;
		int multi = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(div);
		System.out.println(mod);
		
		System.out.println("Sum of number "+ num1+" and "+ num2+ " is = "+ sum);
		
		double number1 = 10.5;
		double number2 = 100.25;
		
		double sumOfTwoNum=number1+number2;
		System.out.println(sumOfTwoNum) ;
		
		int result= 10 + 5 * 3;
		System.out.println(result);
		
		int mod1 = 10 % 3;  // 1
		
		System.out.println(10 % 3);
		
		int result2=(20 % 7)* 3; //18
		System.out.println(result2);
		
		

	}

}
