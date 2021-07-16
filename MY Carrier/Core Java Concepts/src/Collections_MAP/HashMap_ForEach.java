package Collections_MAP;
import java.util.*;
import java.util.function.BiConsumer;


class Mahe implements BiConsumer<String,String>
{

	@Override
	public void accept(String arg0, String arg1) {
		// TODO Auto-generated method stub
		System.out.println( "key "+ arg0 +" value "+arg1 );
	}
	
}
public class HashMap_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map=new HashMap<>();
		map.put("a", "actor");
		map.put("b", "basket");
		map.put("c", "catch");
		map.put("d", "double");
		map.put("e", "example");
				
		BiConsumer<String, String> con=new Mahe();
		map.forEach(con);

		//using lambda
		map.forEach((k,v)->{ System.out.println( k +  " "+v);});
	}

}
