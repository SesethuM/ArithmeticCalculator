package typecasting;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String example
				String str = "Hello";
				str = str  + " World";
				System.out.println("String: "+str);
				
				//String substring method
				String subStr = str.substring(6);
				System.out.println("Substring :"+subStr);
				
				// H   e     l    l   o
		 		// 0   1     2    3   4
		 		
				//String charAt()
				char c = str.charAt(1);
				System.out.println("String charAt function :"+c);
				
				 System.out.println();

				
				//StringBuffer 
				
				StringBuffer bufferstr = new StringBuffer("Hello");
				bufferstr.append(" World");
				System.out.println("StringBuffer :"+bufferstr);
				
				
				// substring method
				String buffersubstring = bufferstr.substring(6);
				 System.out.println("StringBuffer substring:"+buffersubstring);

		         // insert method
				 bufferstr.insert(5,", ");
				 System.out.println("StringBuffer :"+bufferstr);
				 
				 System.out.println();

				 
				 //StringBuilder
				 

					StringBuilder builderstr = new StringBuilder("Hello");
					builderstr.append(" World");
					System.out.println("StringBuilder :"+builderstr);
					
					
					// substring method
					String buildersubstring = bufferstr.substring(6);
					 System.out.println("StringBuilder substring:"+buildersubstring);

			         // insert method
					 builderstr.insert(5,", ");
					 System.out.println("StringBuilder :"+builderstr);
				 
				


	}

}
