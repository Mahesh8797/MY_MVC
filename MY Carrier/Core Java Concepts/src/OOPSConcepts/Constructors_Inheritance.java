package OOPSConcepts;

class SuperClass
{
	SuperClass(int a)
	{
		System.out.println("I am the super class constructor");
	}
	
}
public class Constructors_Inheritance extends SuperClass {

//so when the super class constructor has parameters then we need to define an explicit constructor in subclass and call the super class constructor
	
	Constructors_Inheritance()
	{		
		super(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors_Inheritance ci=new Constructors_Inheritance();
		
	}

}
