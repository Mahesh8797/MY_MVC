package List;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	
	public InvalidAgeException(String s)
	{
		super(s);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
	try
	{
		if(age>18)
		{
			System.out.println("welcome to vote");
		}
		else
		{
			throw  new InvalidAgeException("invaid age");
		}
	}
	catch(Exception e)
	{
		System.out.println("Exception occured : " + e.getMessage() );
	}

	}

}
