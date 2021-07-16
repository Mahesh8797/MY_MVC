package ArrayConcepts;

import java.util.Arrays;

public class Sort_bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp;
		int numbers[]={6,9,4,2,1,5};
		
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=1;j<numbers.length-i;j++)
			{
				if(numbers[j-1]>numbers[j])
				{
					 temp=numbers[j-1];
					numbers[j-1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
