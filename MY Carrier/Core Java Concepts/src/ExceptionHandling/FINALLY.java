package ExceptionHandling;

public class FINALLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		try{
			int data=10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The exception is handled and the finally block is printed");
		}
		
		//2.
		try{
			int data=10/0;
		}
		finally
		{
			System.out.println("The exception is not handled and the finally block is still printed becuase try is only important");
		}
		
		//3.
		try
		{
			
		}		
		finally
		{		
			try
			{
				int arr[]=new int[5];
				arr[9]=9;	
			}
			finally
			{
		 System.out.println("Finally is printed, as the exception arised inside try block");
			}
		}
		
		//4.
		try
		{
			
		}		
		finally
		{	
			int arr[]=new int[5];
			arr[9]=9;	
			System.out.println("Finally is not printed, as the exception arised inside finally block");
		}
		
	//5. 
	try
	{
		System.exit(0);
	}
	finally
	{
		System.out.println("Finally is not printed as the system.exit is called inside try block"); 
	}
	
	}
}

