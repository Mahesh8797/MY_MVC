package Collections_MAP;
import java.util.*;
import java.util.Map.Entry;
public class Map_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Character> map=new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(5, 'e');
		
		Set<Integer> set=map.keySet();
		for(Integer s: set)
		{
			System.out.println(s + "  " +map.get(s));
		}
		Map <Integer,Character> map1=new Hashtable<>();	
		map1.putAll(map);
		Set<Map.Entry<Integer, Character>> s=map1.entrySet();
		for(Map.Entry<Integer, Character> s1: s)
		{
			System.out.println(s1.getKey()+ "  "+ s1.getValue());
		}

	}

}
