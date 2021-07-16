package ExceptionHandling;

import java.util.Scanner;

class Hello extends Exception
{
	String s1;
	public Hello(String s2)
	{
				 s1=s2;
		 }
	
	public String toString()
	{
		return ("My exception is : "+s1);
	}
	
	}


public class USERDEFINEDExp_1 {
	
	public static void validate(int age)
	{
		try
		{
		if(age<50)
		{
			throw new Hello("Invalid age");
		}
		else
		{
			System.out.println("print the age " +age);
		}
	}
		catch(Exception exp)
		{
			
			System.out.println(exp);
		}
	}
	public static void main(String[] args) throws Hello {
		// TODO Auto-generated method stub

		System.out.println("Enter the input : ");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		validate(data);
	}

}
