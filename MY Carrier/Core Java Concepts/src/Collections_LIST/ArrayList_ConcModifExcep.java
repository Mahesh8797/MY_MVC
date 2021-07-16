package Collections_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_ConcModifExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("irk");
		list.add("ghi");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
			if(str.equals("def"))		
				list.remove("def");			
		}
		System.out.println(list);
	}

}
