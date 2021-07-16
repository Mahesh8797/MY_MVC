package DataTypes_Operators;

public class ImplictConversions {

		public static void main(String[] args) {		
			// 128 64 32 16 8 4 2 1 --11100110 since starting is 1 take 1's compli   
			//00011001 so the value should be -26
			//the the value is more than 256 example 300 we split as 256+44 and 
	                     // print only 44
			byte b1=(byte)230;
			System.out.println("will see how conversion works "+b1);	
		
			//0b1101010 so  from 128 to 1 directly apply numbers
			byte b2=(byte)0b1101010;		
			System.out.println("will see how conversion works "+b2);
			

			short a='A';
			System.out.println("Implicit conversion to char "+a);
			
			int b='D';
			System.out.println("Implicit conversion to char "+b);
			
			byte x, y = 1, z = 2; 
			x = (byte) (y + z);		
			System.out.println("will see how conversion works "+x);	
		}
	}
