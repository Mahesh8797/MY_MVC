package Java_7_Features;

public class RethrowException {

	public static void print()
	{
		try
		{
		String a="12_3";
		int b=Integer.parseInt(a);
		System.out.println(b);
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	public static void main(String[] args) {
		
		try
		{
		print();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
