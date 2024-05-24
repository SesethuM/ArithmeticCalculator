package typecasting;

public class Person {
	
	String name;
	int age;
	
	//Properties:
	//1.> Same name as that of the class name 
	//2.> Does not have any return type 
	
	//default constructor
	
	public Person() {
		this.name="Sesethu";
		this.age= 24;
		
			
	}
	//parameterized constructor 
	public Person(String name , int age  ) { 
		this.name=name;
		this.age=age;
		
	}
        public void displayPersonInfo() { 
        	System.out.println("Name:"+ name+",age: "+age); 
        	
        }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //creating obj for default constructor
		
		Person obj1 = new Person();
		obj1.displayPersonInfo(); // Name: Sesethu , age 24
		
		//creating obj for parameterized constructor 
		
		Person obj2 = new Person("Molemo",25);
		obj2.displayPersonInfo(); //Name: Molemo , age 250
	}

}
