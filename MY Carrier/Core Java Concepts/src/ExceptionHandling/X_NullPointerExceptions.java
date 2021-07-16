package ExceptionHandling;

public class X_NullPointerExceptions {
	public static X_NullPointerExceptions print()
	{
		return null;		
	}
	void show(String s)
	{
		System.out.println(s);
	}
	static void hello(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Null pointer exception when the instance method returns null
		X_NullPointerExceptions x= print();
		x.show("hello");
			
	
    	//2. when array lenght is null
	    int arr[]=null;
	    int len=arr.length;
	    //System.out.println(arr[5]);
	    
	    //3.when we pass the argument as null
	    hello(null);
	    
	    //4.throw null
	    int data=10;
	    if(data>0)
	    {
	    	throw null;
	    }
	    
	    //5. Synchronized argument is null
	    String mutext=null;
	    synchronized(mutext)
	    {
	    	System.out.println("synchronized block");
	    }
	    
	}
}
