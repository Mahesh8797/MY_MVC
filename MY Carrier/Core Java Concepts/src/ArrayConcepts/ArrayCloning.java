package ArrayConcepts;

import java.util.Arrays;

public class ArrayCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={40,70,10,20};
		for(int a:arr)
		{
			System.out.println(a);
		}
		int clone[];
		clone=arr.clone();
		for(int b: clone)
		{
			System.out.println(b);
		}
		System.out.println(arr==clone); //== checks the object reference
		System.out.println(Arrays.equals(arr, clone)); //equals method checks the value
		}
	

}
