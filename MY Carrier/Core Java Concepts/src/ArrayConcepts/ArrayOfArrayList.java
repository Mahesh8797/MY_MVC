package ArrayConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first type is of adding the list to array and then printing the arraylist
		ArrayList<String >l1= new ArrayList<>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		ArrayList<String> l2= new ArrayList<>();
		l2.add("1");
		l2.add("2");
		l2.add("3");
		l2.add("4");
		ArrayList <String> arr[] =new ArrayList[2];
		arr[0]=l1;
		arr[1]=l2;
		ArrayList <String> l =new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
		l=arr[i];		
		System.out.println(l);
		}
		System.out.println(" ");
		//second type is of adding the string to list and printing the array
		ArrayList<String[]> list= new ArrayList<String[]>();
		String[] arr1={"1","2","3","4","5"};
		String[] arr2={"5","6","8","9"};				
		list.add(arr1);
		list.add(arr2);		
		for(String arr21[]: list)
		{
			System.out.println(Arrays.toString(arr21));
		}		
	}
}
