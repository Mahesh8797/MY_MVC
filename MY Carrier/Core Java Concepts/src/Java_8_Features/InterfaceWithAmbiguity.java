package Java_8_Features;

interface A
{
	default void show()
	{
		System.out.println("I am A");
	}
}
interface B
{
	default void show()
	{
		System.out.println("I am B");
	}
}
public class InterfaceWithAmbiguity implements A,B{

 public void show()
 {
	 System.out.println("I belong to class");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new InterfaceWithAmbiguity();
		a.show();
		B b=new InterfaceWithAmbiguity();
		b.show();
		InterfaceWithAmbiguity im=new InterfaceWithAmbiguity();
		im.show();
		
	}

	
	

}
