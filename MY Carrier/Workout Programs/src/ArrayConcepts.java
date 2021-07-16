import java.util.Arrays;

import javax.print.DocFlavor.INPUT_STREAM;

public class ArrayConcepts {

	ArrayConcepts(int...b)
	{
		for(int a:b)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
		ArrayConcepts arr=new ArrayConcepts(34,42,45,46);
		char ar[]={'a','b','c','d','e','f','g','h','i'};
		char d[]=new char [6];
		System.arraycopy(ar, 1, d, 0, 6);
		System.out.println(Arrays.toString(d));
		int array[]={40,34,10,95};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
				
		}
	}


