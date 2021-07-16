class Sample
{
	final int a;
	Sample()
	{
		a=10;
		System.out.println("Constructor is called every time "+a);
	}
}
public class Constructors extends Sample {

	int a;
	int b;
	Constructors()
	{
		super();
		System.out.println("This constructor is created for calling super class constructor");		
	}
	Constructors(int a)
	{
		this(23,34);
		System.out.println("This constructor is created for calling single argument cons "+a);
	}
	Constructors(int a, int b)
	{
		System.out.println("This constructor is created for calling multiple argument cons "+ (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors c1=new Constructors();
		Constructors c2=new Constructors(10);
		Constructors c3=new Constructors(10,20);
		
	}
	

}
