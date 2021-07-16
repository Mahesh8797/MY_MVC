package Constructors;

public class PrivateCons {
	
	private PrivateCons()
	{
		System.out.println("I will not be called");
	}

//throws compile time error as private constructor cannot be called

/*class sample extends PrivateCons
	{		
	sample()
	{
		
	}*/
	public static void main(String[] args) {
		 
		PrivateCons pc=new PrivateCons();
	}

}
