package ExceptionHandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			try
			{
				int arr[]=new int[4];
				arr[6]=10;				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				int a=10/0;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Exception handled");

	}

}
