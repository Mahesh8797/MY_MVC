package DataTypes_Operators;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num1= 23434;
		int num2=3534;
		long num3;
		num3=num1+num2;
	//	int num4=num1+num2; //cannot convert from long to int
		int num5=(int)num1; //converting long to int
		int num6=num2+num5;
		
		System.out.println(num3);
		System.out.println(num6);
		
		
		//byte to short conversions
		int a=14;
		byte b=12;
		
		int c=a+b;
	//	byte b1=a+b; //cannot mismatch
		byte b2=(byte)a;
		 byte b3=(byte) (b+b2);
		 
		 System.out.println(c);
			System.out.println(b3);
			 
		
	}

}
