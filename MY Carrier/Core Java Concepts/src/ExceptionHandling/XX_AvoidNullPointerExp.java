package ExceptionHandling;

public class XX_AvoidNullPointerExp {

	static void print(String s)
	{
		if("Test".equals(s))  //if we provide s.equals("Test") it throws null pointer exception
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.check if the value is equal to null
		String mutex=null;
		if(mutex==null)
		mutex="";
		synchronized(mutex)
		{
			System.out.println("Synchronized block");
		}
		//2.passing string as null;
		String s=null;
		print(s);
		
		//3. throw new Illegal Argument exception if required
		int arr[]=null;
		try
		{
		if(arr==null)
			throw new IllegalArgumentException("illegal");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught : " +e.getMessage());
		}
		
		//4.Using ternary operator
		String str=null;
		String msg=(str==null) ?  "The value is null." : str.substring(1,5);
		System.out.println(msg);
		
		//5. Using String.ValueOf instead of toString
		
		String value=null;		
			String su=String.valueOf(value); //if we add toString the null pointer exception will come
			synchronized(su)
			{
				System.out.println("print anything");
			}
			
	}

}
