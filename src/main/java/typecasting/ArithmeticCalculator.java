package typecasting;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the fisrt number : ");
		double num1 = scanner.nextDouble(); 
		
		System.out.println("Choose the opearation (+ ,- ,* ,/): ");
		char operation = scanner.next().charAt(0);
		
		System.out.println(" Enter the second number : ");
		double num2 = scanner.nextDouble();
		
		
		
		double result;
		
		switch (operation) { 
		case '+' : 
			result  =num1 + num2;
			System.out.println("Result: " + result );
			break;
		case '-': 
			result =num1 - num2;
			System.out.println("Result : " + result );
			break;
		case '*' : 
			result = num1* num2;
			System.out.println("Result : " + result);
			break;
		case '/': 
			
			if (num2 ==0) { 
				System.out.println("Cannot divide by zero");
			}
			else {
				result = num1 /num2 ;
				System.out.println("Result: " + result);
				
			}
			
			break;
			default: 
				System.out.println(" Invalid operation");
		}
				
				scanner.close();

	}

}
