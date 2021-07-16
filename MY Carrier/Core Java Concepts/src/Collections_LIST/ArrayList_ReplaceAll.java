package Collections_LIST;

import java.util.*;
import java.util.function.UnaryOperator;
public class ArrayList_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		list.replaceAll(x->{return x*10;});
		System.out.println(list);
		
		UnaryOperator<Integer> un=new Mahe();
		list.replaceAll(un);
		System.out.println(list);
		
	}
}
class Mahe implements UnaryOperator<Integer>
{

	@Override
	public Integer apply(Integer arg0) {
		// TODO Auto-generated method stub
		return arg0*5;
	}

	
}