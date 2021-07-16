import java.util.*;
public class CollectionsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Character> map=new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, null);
		map.put(null, 'd');
		map.put(5, 'c');
		
		Set<Integer> set=map.keySet();
		for(Integer i: set)
		{
			System.out.println("key "+i+ " Value "+map.get(i));
		}
		
		Set<Map.Entry<Integer,Character>> s=map.entrySet();
		for(Map.Entry<Integer,Character> m: s)
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		Iterator<Map.Entry<Integer,Character>> itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Character> m=itr.next();
			System.out.println(m.getKey()+ " "+m.getValue());
			if(m.getKey()==null)
			{
				itr.remove();
			}
		}
		
		System.out.println(map);
    
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 5);
		m.put(4, 4);
		m.put(5, 5);
		
		m.replaceAll((k,v)->{ 
			if(k!=null) {return k+v;}
		else return v;});
		System.out.println(m);
		
		Map<String,String> maps=new HashMap<>();
		maps.put("a", "a");
		maps.put("b", "b");
		maps.put("c", null);
		maps.put(null, "d");
		
		Set<Map.Entry<String,String>> sets=maps.entrySet();
		for(Map.Entry<String, String> mm: sets)
		{
			if(mm.getKey()!=null && mm.getValue()!=null)
			{
				maps.merge(mm.getKey(), mm.getKey(), (k,v)->{ return k+v;});
			}
		}
		System.out.println(maps);
		
		String value=maps.putIfAbsent("c", "c");
		System.out.println(maps);
		System.out.println(value);
		
		
		
	}

}
