package Java_7_Features;

public class CatchMultipleExceptions {

	public static void main(String[] args) 
	{
		try
		{
			int arr[]=new int[6];
			arr[6]=30;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  e)
		{
			System.out.println(e);
		}

	}

}
