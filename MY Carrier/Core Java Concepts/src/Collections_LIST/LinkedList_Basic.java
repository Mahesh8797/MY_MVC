package Collections_LIST;
import java.util.*;
public class LinkedList_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new LinkedList();
		list.add("Hello");
		list.add("dldk");
		list.add("$%$%");
		list.add(4534);
		list.add(5322);
		System.out.println(list);
		
		//now when i specify the type it will allow elements only of that type
		List<String> l=new LinkedList<>();
		l.add("a");
		l.add("c");
		l.add("d");
	//	l.add(123); //throws compiler error
		System.out.println(l);
		
	}

}
