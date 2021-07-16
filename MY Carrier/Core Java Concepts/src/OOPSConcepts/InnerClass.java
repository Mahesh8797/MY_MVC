package OOPSConcepts;

public class InnerClass {

	public int ab=10;
	private class inner
	{
		void sum()
		{
			System.out.println("Helo " + ab);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InnerClass in=new InnerClass();
InnerClass.inner out=in.new inner();
out.sum();
	}

}
