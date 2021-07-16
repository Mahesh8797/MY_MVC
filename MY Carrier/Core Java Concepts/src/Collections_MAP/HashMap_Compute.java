package Collections_MAP;
import java.util.*;
public class HashMap_Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		map.put("1","1");
		map.put("2", "b");
		map.put("3", "c");		
		map.put(null,"e");
		map.put("4", null);
		map.put(null, "null");
		System.out.println(map);
		
		//1. compute
		Set<String> set=map.keySet();
		for(String s: set)
		{
			map.compute(s, (k,v)->{return k + v;});
		}
		map.compute("5", (k, v) -> {return k + v;});		
		System.out.println(map);
		System.out.println();
		
		//2. Compute if present
		for(String s: set)
		{
			map.computeIfPresent(s, (k,v)->{return k + v;});
		}
		System.out.println(map);
		map.computeIfPresent("4", (k,v)-> {return null;});
		System.out.println(map);
		System.out.println();
		
		//3.Compute if absent
		for(String s: set)
		{
			map.computeIfAbsent(s, v -> {return v;});		
		}
		System.out.println(map);
		map.computeIfAbsent("6", v -> {return v;});
		System.out.println(map);
		map.computeIfAbsent("7", v -> {return null;});
		System.out.println(map);
	}
}
