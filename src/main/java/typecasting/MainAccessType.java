package typecasting;

//Class B
public class MainAccessType {
	
	public static void main(String args[]) {
		AccessModifier obj = new AccessModifier();
		
		//Accesssing public member
		System.out.println("Pubic variable:"+obj.publicVar);
      obj.publicMethod();
      // Accesssing protected member
		System.out.println("Protected variale:"+obj.protedVar);
		obj.protectedMethod();
		// Accessing default memeber 
		System.out.println("Default Variable:"+obj.defaultVar);
		obj.defaultMethod();
		// can't access the private members because scope of the private is limited to the class it is declared
		System.out.println();

	}
	
}
