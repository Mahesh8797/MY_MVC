package Collections_MAP;
import java.util.*;
public class HashMap_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		map.put("1","1");
		map.put("2", "b");
		map.put("3", "c");		
		map.put(null,"e");
		map.put("4", null);
		System.out.println(map);
		System.out.println();
		Set<Map.Entry<String,String>> set=map.entrySet();
		for(Map.Entry<String,String> s : set)
		{
			if(s.getKey()!=null && s.getValue()!=null)
			{
				map.merge(s.getKey(), s.getKey(), (k,v)->{ return k + v;});
			}
		}
		System.out.println(map);
		System.out.println();
			
		map.merge("5", "5", (k,v)->{ return k + v;});
		System.out.println(map);
		System.out.println();
		
		map.merge("3", "c", (k,v)->{ return null;});
		System.out.println(map);
	}

}
