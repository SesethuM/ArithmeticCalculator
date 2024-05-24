package typecasting;

public class PalindromeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int number = 121; // The number we want to reverse 
		
		int originalNumber = number; // Save the original number to compare later
		
		int reversedNumber = 0; //This will hold the reversed number 
		
		while (number!=0) { // Keep going until the number is 0 
			int lastDigit = number % 10; // Get the last digit
			
			reversedNumber = reversedNumber * 10 + lastDigit; //Add it to the reversed number 
			number= number/10; 
			//Remove the last digit from the original number 
		}
		//Check if the original number and the reversed number are the same 
		if (originalNumber == reversedNumber) { 
			
			System.out.println(originalNumber+ " Is a palindrome!"); }
		
		else { 
			System.out.println(originalNumber + "Is not a palindrome.");
			
			}
				// what is the percent sign mean in Java and coding ? Research
	}

}
