package typecasting;

//Class A
public class AccessModifier {
	// Access modifiers
	
	// if we declare a variable or method as public then we can use it anywhere following the java rule
	public int publicVar = 10;
	
	// if declare can use protected variables and methods under same pakages or under same  subclass
	protected int protedVar = 20;
	// if declare can use protected variables and methods under same pakages 
	int defaultVar = 30;
	
	// if i declare variable or method private then i cant use that outside the class
	private int privateVar = 40;
	
	
	// if we declare a variable or method as public then we can use it anywhere following the java rules
	public void publicMethod() {
		System.out.println("This is public method:");
	}
	// if declare can use protected variables and methods under same pakages or under same  subclass
	protected void protectedMethod() {
		System.out.println("This is protected method:");
	}
	// if declare can use protected variables and methods under same pakages 
	void defaultMethod() {
		System.out.println("This is default method:");
	}
	// if i declare variable or method private then i cant use that outside the class
	private void privateMethod() {
		System.out.println("This is private method:");

	}

}
