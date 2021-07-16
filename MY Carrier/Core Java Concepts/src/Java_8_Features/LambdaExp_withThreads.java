package Java_8_Features;

public class LambdaExp_withThreads  {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable()
				{
			public void run()
			{
				System.out.println("hello");
			}
				};
				Thread t1=new Thread(r1);
				t1.start();
				
		Runnable r=()->{System.out.println("hi");};
		Thread t2=new Thread(r);
		t2.start();
		
	

}
}