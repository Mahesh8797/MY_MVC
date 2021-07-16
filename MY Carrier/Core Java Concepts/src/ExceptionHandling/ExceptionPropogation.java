package ExceptionHandling;

public class ExceptionPropogation {

	public static void a()
	{
		int data=10/0;
	}
	public static void b()
	{
		a();
	}
	public static void c()
	{
		try
		{
			b();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only unchecked exceptions can be forwarded or propogated
    System.out.println("Exception is propogated");
    c();
		
	}

}
