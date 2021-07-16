package ArrayConcepts;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]={'a','b','c','d','e','f','g','h','i','g'};
		char b[]=new char[7];
		
		System.arraycopy(a, 2, b, 0, 7);
		
			System.out.println(String.valueOf(b));
		
	}

}
