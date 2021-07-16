package OOPSConcepts;

class Sample2
{
	String name="mahe";
	void display()
	{
		 System.out.println("I will  be displayed as i am extended by another sub class which has been extended by another class");
	}
}
class Sample3 extends Sample2
{
    static char c[]={'a','e','i'};
     void print()
     {
     System.out.println(name);
}
}
public class MultiLevelInheritance extends Sample3{

	static int i;
	static void show()
	{
		for(  i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance mi=new MultiLevelInheritance();
		show();
		mi.print();
		mi.display();

	}

}
