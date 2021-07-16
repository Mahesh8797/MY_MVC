package StringPrograms;

import java.util.Arrays;

public class DistinctCharactersandCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABADEBC";
		char arr[]=str.toCharArray();
		System.out.println(Arrays.toString((arr)));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					i++;
				}
				else
				{
					System.out.println(arr[i]);
				}
			}
		}
		

	}

}
