package typecasting;

public class Methods {
	
	// Void doesn't have any return type
	public void ArthmaticCal() {
		int a = 5;
	    int b = 6;
	    System.out.println("Addition of numbers :" +(a+b));
	    System.out.println("Multiplication of numbers :" +(a*b));
	    System.out.println("Division of numbers :" +(a/b));
	}
	
	// this method has the String return type
	public String Color(String color) {
		return color;
	}
	
	// it has  the interger return type
	public  int number(int no) {
		return no;
	}

	
	//Driver Method 
	public static void main(String args[])
	{
	   String  color = "Orange"; 
	   Methods mt = new Methods();
	   mt.ArthmaticCal();
	   
	   // here we are using the Color method which is of type String
	   System.out.println(mt.Color(color));
	   
	   // here we are using the number method
	   System.out.println(mt.number(5));


	}

}
