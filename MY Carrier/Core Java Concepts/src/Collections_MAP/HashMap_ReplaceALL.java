package Collections_MAP;
import java.util.*;
public class HashMap_ReplaceALL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		map.put("1","1");
		map.put("2", "b");
		map.put("3", "c");		
		map.put(null,"e");
		System.out.println(map);
		map.replaceAll((k,v)->{
		 if(k!=null)	 return k + v; 	  
		 else return v;});
		System.out.println(map);
	}

}
