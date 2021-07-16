package Constructors;
import Access_Modifiers.ProtectedClass;
public class FirstConstructor {
	
	FirstConstructor()
	{
		System.out.println("i am first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstConstructor fc =new FirstConstructor();
		subclass s=new subclass();
		s.print();
	}

}
class subclass extends ProtectedClass
{	
	void print()
	{
		System.out.println(num);
	}
}
