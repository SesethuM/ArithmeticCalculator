package typecasting;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String word = "Madam";
        String lword = word.toLowerCase(); 
		
		String reversedWord = new StringBuilder(lword).reverse().toString();
		
		if(lword.equals(reversedWord)) {
			
		
            System.out.println(word + " is a palindrome!");
            
		}   else {
		System.out.println(word + " is not a palindrome.");
		
         }
		

//Madam = madaM 
		//TO MAKE THEM ALL LOWER CASE 
	}

}
