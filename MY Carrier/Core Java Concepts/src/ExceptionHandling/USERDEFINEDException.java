package ExceptionHandling;

class MaheException extends Exception
{
	public MaheException(String s)
	{
		super(s);
	}
}
public class USERDEFINEDException  {

	public static void validate(int age)
	{
		try
		{
		if(age<50)
			throw new MaheException("Invalid age");
	}
		catch(Exception e)
		{
			System.out.println("Exception handled : " +e.getMessage() );
		}
	}
	public static void main(String[] args)throws MaheException {
		// TODO Auto-generated method stub
		
		validate(40);

	}

}
