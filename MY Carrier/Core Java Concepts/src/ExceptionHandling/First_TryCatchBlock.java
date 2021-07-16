package ExceptionHandling;

public class First_TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Rest of the code executed");

	}

}
