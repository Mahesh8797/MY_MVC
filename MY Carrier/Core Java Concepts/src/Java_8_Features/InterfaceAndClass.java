package Java_8_Features;

interface H
{
	default void hello()
	{
		System.out.println("hi");
	}
}

class M 
{
	public void hello()
	{
		System.out.println("hello");
	}
}
public class InterfaceAndClass extends M implements H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceAndClass ic=new InterfaceAndClass();
		ic.hello();
	}

}
