package Collections_LIST;

import java.util.*;
import java.util.function.Predicate;
public class ArrayList_RemoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(0);
		list.add(7);
		System.out.println(list);
		
		Predicate<Integer> predicate= new Yog();
		list.removeIf(predicate);
		System.out.println(list);
		
		
		list.removeIf((x)->{ return x%2==0;});
		System.out.println(list);
		
		
	}

}
class Yog implements Predicate<Integer>
{

	@Override
	public boolean test(Integer arg0) {
		
		return arg0%3==0;
	}
	
}