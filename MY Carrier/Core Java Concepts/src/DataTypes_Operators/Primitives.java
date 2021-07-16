package DataTypes_Operators;

public class Primitives {

		public static void main(String[] args) {		
	        //8 data types
		   // 1.boolean 1 bit
	           //default value is false it can be true also
		    boolean ab=false;  
		    System.out.println("Boolean is "+ab);
		    //2. byte 8 bits when we want to reduce the space in larger arrays we can go for byte
		    //default value is 0
			byte abc=90;
		    System.out.println("Byte value is "+abc);
		    //3. short 16 bits when less space is required
		    //default value is 0
		    short abcd=5678;
		    System.out.println("Short is "+abcd);
		    //4. int 64 bits when space is not considered
		  //default value is 0
		    int abcde=1234567;
		    System.out.println("Int is "+abcde);
		    //5. Long 128 bits appended with L or l
		  //default value is 0L
		    long abcdef=12233445657899L;
		    System.out.println("Long is "+abcdef);
		    //6. float 64 bits appended with F or f
		  //default value is 0.0F
		    float a=1234.567f;
		    System.out.println("Float  is "+a);
		    //7. Double 128 bits appended with d or D
		   //default value is 0.0D
		    double b=454656.785787647d;	    
		    System.out.println("Double  is "+b);
		    //8. char takes unicode from \u0000 to \uFFFF 0-9 and A-F
		    ////default value is '\u0000'
		    char c='A';
		    System.out.println(c);
		    char d=70;
		    System.out.println("print the ascii value "+d);
		    char e='\t';
		    System.out.println("print tab value "+e+" after some value");	    
		}
	}
