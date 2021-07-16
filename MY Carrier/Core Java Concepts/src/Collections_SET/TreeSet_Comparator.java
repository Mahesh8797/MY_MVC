package Collections_SET;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.*;

/*class  Books implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1%10 > o2%10)
		{
			return 1;
		}
		return -1;
	}
	
	
}*/
public class TreeSet_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> books=new TreeSet<>();
		books.add(8762);
		books.add(1236);
		books.add(2381);
		books.add(8645);
		books.add(4820);
		System.out.println(books);                                                                    		
		 List<Integer> list=new ArrayList<>(books);		 
		 Comparator<Integer> com=new Comparator<Integer>()
				 {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						if(o1%10 > o2%10)
						{
							return 1;
						}
						return -1;
						
					}
			 
				 }
		 ;
		 Collections.sort(list,com);
		 System.out.println(list);
		books=new TreeSet<Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				if(arg0%10> arg1%10)
					return 1;
				return -1;
			}
			
		});
		books.add(8762);
		books.add(1236);
		books.add(2381);
		books.add(8645);
		books.add(4820);
		System.out.println(books);
	}

}
