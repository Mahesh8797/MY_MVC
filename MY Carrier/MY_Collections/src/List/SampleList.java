package List;

import java.util.AbstractList;
import java.util.ArrayList;

public class SampleList extends AbstractList{

	static AbstractList<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		list.add(0);
		list.add(1);
		SampleList s=new SampleList();
		s.get(0);
		s.size();
		list.set(0, 5);
		s.get(0);
	}

	@Override
	public Object get(int arg0) {
		// TODO Auto-generated method stub
		System.out.println(list.get(0));
		return list.get(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println(list.size());
		System.out.println(list.hashCode());
		return list.size();
	}

}
