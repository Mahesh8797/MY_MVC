import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class Patient implements Comparable<Patient>
{
	String name;
	int priority;
	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + "]";
	}
	
	public Patient(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}

	@Override
	public int compareTo(Patient arg0) {
		if(this.priority > arg0.priority)
		{
		return 1;
	}
		return -1;
	}
	
}
public class CollectionsStackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		
		Queue<Integer> que=new LinkedList<>();
		
		Queue<Integer> queue=new ArrayBlockingQueue<>(4);
		queue.add(10);
		queue.offer(20);
		queue.add(30);
		queue.offer(40);
		System.out.println(queue);
		queue.offer(50);
		//queue.add(60);
		queue.poll();
		queue.remove();
		/*System.out.println(queue);
		System.out.println(queue.peek());
		queue.clear();
		System.out.println(queue.peek());
		System.out.println(queue.poll());	
		System.out.println(queue.remove());
		System.out.println(queue.element());*/
				
		Queue<Patient> p=new PriorityQueue<Patient>();
		p.add(new Patient("dhana",4));
		p.add(new Patient("kanni",3));
		p.add(new Patient("mani",2));
		p.add(new Patient("mahesh",1));
		
		/*List<Patient> list=new ArrayList<>(p);
		Comparator<Patient> com=(x,y)->{ if(x.priority<y.priority) return 1; else return -1;};
		Collections.sort(list, com);*/
		for(Patient pa:p)
		{
			System.out.println(pa);
		}
		
	}

}
