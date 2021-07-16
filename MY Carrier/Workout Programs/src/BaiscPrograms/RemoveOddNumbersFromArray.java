package BaiscPrograms;
import java.util.*;
public class RemoveOddNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr[]={"2","7","5","4","9","6","8"};
		
		int ar[]=new int[arr.length];
		int index=0;
		for(String a: arr)
		{
			ar[index]=Integer.parseInt(a.trim());
			index++;
		}
		
		System.out.println(Arrays.toString(ar));
		List<Integer> list=new ArrayList<>();
		for(int a: ar)
		{
			if(a%2==0)
			{
				list.add(a);
			}
		}
		System.out.println(list);
		
		Integer arra[]=new Integer[list.size()];
		arra=list.toArray(arra);
		
		System.out.println(Arrays.toString(arra));
	}

}
