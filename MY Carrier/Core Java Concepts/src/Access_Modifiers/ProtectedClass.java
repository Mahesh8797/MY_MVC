package Access_Modifiers;
 class Outerclass
{
	 protected int num =5;
	private void display()
	{
		System.out.println("i am private method of another class");
	}
}

public class ProtectedClass extends Outerclass {
	protected int num =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClass pc= new ProtectedClass();
	//	pc.display();
		System.out.println(pc.num);
	}

}
