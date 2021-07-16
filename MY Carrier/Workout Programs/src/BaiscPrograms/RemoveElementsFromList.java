package BaiscPrograms;
import java.util.*;
public class RemoveElementsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the line");
		String line=sc.next();
		
		String arr[]=line.split(",");
		
		List<String> list=new ArrayList<>(Arrays.asList(arr));
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String sent=itr.next();
			System.out.println(sent);
			if(sent.equalsIgnoreCase("stay"))
				itr.remove();
		}
		System.out.println(list);
	}

}
