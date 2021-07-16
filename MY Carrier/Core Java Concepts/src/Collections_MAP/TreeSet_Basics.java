package Collections_MAP;
import java.util.*;
public class TreeSet_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new TreeMap<>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		map.put(4,"d");		
	  map=new TreeMap<Integer, String>(new Comparator<Integer>()
				{
					@Override
					public int compare(Integer arg0, Integer arg1) {
						
						if(arg0<arg1) return 1;
						else return -1;						
					}			
				});
	    map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		System.out.println(map);
	}	
}
