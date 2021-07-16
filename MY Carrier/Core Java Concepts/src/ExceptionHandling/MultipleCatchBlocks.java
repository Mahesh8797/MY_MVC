package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int arr[]=new int[5];
		arr[4]=46/0;
		arr[6]=10;
		}		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Outofblock");
		
	}

}
