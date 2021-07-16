package Constructors;

class hello 
{
	hello()
	{
		
		System.out.println("I am the constructor of subclass");
	}
	
}
public class SuperCons extends hello{

	SuperCons()
	{
		super();
		System.out.println("I am the constructor of super class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCons h=new SuperCons();

	}
}
  