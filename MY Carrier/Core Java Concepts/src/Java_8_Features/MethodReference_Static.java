package Java_8_Features;

interface Sayable
{
	void say();
	
}
public class MethodReference_Static {
	
	public static void hello()
	{
		System.out.println("print");
	}
	public static void thread()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable m=MethodReference_Static::hello; //in place of lambda expression
		m.say();
	//predefined functional interface	
		Thread t=new Thread(MethodReference_Static::thread); //Runnable interface is predefined
		t.start();		

	}

}
