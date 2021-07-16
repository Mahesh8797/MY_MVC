package Collections_SET;
import java.util.*;

class Print
{
	private int num;
	Print(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return "num " +num;
	}
}

public class Xamples_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Print> set=new HashSet<Print>();
		set.add(new Print(100));
		set.add(new Print(220));
		for(Print p: set)
		{
			System.out.println(p);
		}

	}

}
