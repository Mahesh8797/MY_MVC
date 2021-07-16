package Collections_XQueue;
import java.util.*;
class MaheYog implements Comparable<MaheYog>
{
	int priority;
	String name;

	public MaheYog(int priority, String name) {
		
		this.priority = priority;
		this.name = name;
	}
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		
		return "Priority : "+ priority +" Name : "+ name;
	}

	@Override
	public int compareTo(MaheYog arg0) {
		
		if(this.priority> arg0.priority)
		{
		return 1;
	    }
		return -1;
	}

}
public class XXXPriorityQueue_ComparatorXXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<MaheYog> queue=new PriorityQueue<>();
		queue.add(new MaheYog(3,"ABC"));
		queue.add(new MaheYog(2,"DEF"));
		queue.add(new MaheYog(2,"HIJ"));
		queue.add(new MaheYog(1,"KLM"));
		queue.add(new MaheYog(4,"NOP"));
		
		for(MaheYog s: queue)
		{
			System.out.println(s);
		}
	}

}
