package OOPSConcepts;
abstract class ABC
{
	private int id;
	ABC(int id)
	{
		this.id=id;
	}
	abstract void sum();
	void hello()
	{
		System.out.println("I am already defined");
	}	
}
public class AbstractClass extends ABC{
	private int id;
	AbstractClass(int id)
	{
		super(id);	
		this.id=id;
	}	
	@Override
	void sum() 
	{
		if(id==0)
		{
			System.out.println("Heloi");
		}
		else
		{
			System.out.println("Hii");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC a=new AbstractClass(20);
System.out.println(a);
a=new AbstractClass(0);
System.out.println(a);
a.sum();
a.hello();
	}
	public String toString()
	{
		return "ID :"+ id;
	}
}
