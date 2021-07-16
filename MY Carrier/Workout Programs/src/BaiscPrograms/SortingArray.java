package BaiscPrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={5,6,4,8,1,3};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print( arr[i]+" ");
	          }
		System.out.println(Arrays.toString(arr));
	 	}
	

}
