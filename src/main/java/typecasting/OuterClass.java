package typecasting;

public class OuterClass {
	
	private String outerfield = "Outer Field";
	
	//inner class
	class InnerClass{
		private String innerfield ="Inner Field";
		
		void display() { 
			//accessing outer class's field from inner class
			System.out.println("Outer Field: "+outerfield);
			System.out.println("Inner Field: "+innerfield);
		}
	}

	//Method in the outer class
	void createII() { 
		InnerClass ic = new InnerClass();
		ic.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an instance of the outer class
		OuterClass oc = new OuterClass();
		
		//create an instance of the Innerclass through outerclass
		
		OuterClass.InnerClass ic = oc.new InnerClass();
		
		ic.display();
		oc.createII();

	}

}
