package Collections_MAP;
import java.util.*;
public class Map_HashMap_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("a", "actor");
		map.put("b", "basket");
		map.put("c", "catch");
		map.put("d", "double");
		map.put("e", "example");
		
		System.out.println(map);
		Set<String> ks=map.keySet();
		for(String s: ks)
		{
			System.out.println(s+ "  "+ map.get(s));
		}		
		map.remove("e");
		ks.remove("d");
		System.out.println();
		for(String s: ks)
		{
			System.out.println(s+ "  "+ map.get(s));
		}
		System.out.println();
		System.out.println(ks);
		System.out.println();
		Collection<String> value= map.values();
		System.out.println(value);
		value.remove("basket");
		System.out.println();
		System.out.println(value);
		

	}

}
