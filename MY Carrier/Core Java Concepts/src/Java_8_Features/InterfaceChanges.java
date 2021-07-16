package Java_8_Features;

interface Mahe
{
	void print();
	default void show()
	{
		System.out.println("I am an interface method");
	}
}

class Aarthi implements Mahe
{
	public void print()
	{
		System.out.println("I am implemented");
	}
}
public class InterfaceChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aarthi a=new Aarthi();
		a.print();
		a.show();

	}

}
