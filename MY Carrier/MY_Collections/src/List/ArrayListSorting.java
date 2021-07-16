package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"Arun","Seven","Three","Bombay","Cat"};
		List<String> l=new ArrayList<String>();
		l=Arrays.asList(arr);
		System.out.println(l);
		
		Comparator<String> comp=new Comparator<String>()
				{

					@Override
					public int compare(String arg0, String arg1) {
						
						return arg0.compareTo(arg1);					
					}
			
				};
				Collections.sort(l,comp);	
		System.out.println(l);
			
	}

}
