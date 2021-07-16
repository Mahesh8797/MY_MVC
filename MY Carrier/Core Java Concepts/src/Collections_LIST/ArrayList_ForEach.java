package Collections_LIST;

import java.util.*;
import java.util.function.Consumer;
public class ArrayList_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("irk");
		list.add("ghi");

		Consumer<String> consumer=new Hi();
		list.forEach(consumer);
		
		list.forEach((x)->System.out.println("With Lambda "+x));
	}

}
class Hi implements Consumer<String>
{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("Without lambda "+t);
	}

	
	
	
}