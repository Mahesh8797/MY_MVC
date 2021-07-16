package StringConcepts;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I belong to me";
		String result1[]=str.split(" ");
		for(int i=0;i<result1.length;i++)
				{
		System.out.print(result1[i]);
	}
		System.out.println(" ");
		System.out.println("Printing in the array type "+Arrays.toString(result1));
	
	String dif="Mahe,Syntel,Sipcot";	
	String result2[]=dif.split(",",2);
	System.out.println("Splitting using delimiters "+Arrays.toString(result2));
	
	String number="I|belong|to|me";
	String result3[]=number.split("\\|");
	System.out.println("Splitting using pipeline "+Arrays.toString(result3));

	
}
}
