package Collections_SET;
import java.util.*;

class Students implements Comparable<Students>
{

	int rollnum;
	int marks;
	
	public Students(int rollnum, int marks) {
		
		this.rollnum = rollnum;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		
		if(this.marks<o.marks)
		{
			return 1;
		}
		return -1;
	}
		
	public String toString()
	{
		return "[ROLL]" + rollnum + "[Marks]" + marks +"\n";
	}
	
}

public class TreeSet_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Students> ss=new TreeSet<Students>();
		ss.add(new Students(1, 99));
		ss.add(new Students(5,85));
		ss.add(new Students(3,100));
		
		System.out.println(ss);
	}

}
