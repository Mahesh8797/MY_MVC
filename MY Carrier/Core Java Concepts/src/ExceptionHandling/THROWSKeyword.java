package ExceptionHandling;

import java.io.IOException;

public class THROWSKeyword {

		public static void a() throws IOException
		{		
			System.out.println("Handled");
			throw new IOException("I am caught");
		}
		public static void b() throws IOException
		{
			a();
		}
		public static void c() throws IOException
		{
			//b();
			try
			{
				b();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public static void main(String[] args)throws IOException {
			
			//only checked exceptions can be forwarded or propogated
	    System.out.println("Exception is propogated");
	    c();
			
		}

	}
