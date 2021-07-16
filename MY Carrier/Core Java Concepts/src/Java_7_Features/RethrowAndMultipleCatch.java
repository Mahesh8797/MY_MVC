package Java_7_Features;
class FirstException extends Exception
{
	public FirstException(String s)
	{
		super(s);
	}
}
class SecondException extends Exception
{
	public SecondException(String s)
	{
		super(s);
	}
}
class ThirdException extends Exception
{
	public ThirdException(String s)
	{
		super(s);
	}
}
public class RethrowAndMultipleCatch {

	public static void find(String s) throws FirstException, SecondException,ThirdException
	{
		try
		{
			if(s.equals("one")){
				
				throw new FirstException("one");
			}
			else if(s.equals("two"))
			{
				
					throw new SecondException("two");
			}
			else
			{
				throw new ThirdException("Exception here");
			}			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	public static void main(String[] args) {
		

		String s="hello";
		try
		{
			find(s);
		}
		catch(FirstException | SecondException | ThirdException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
