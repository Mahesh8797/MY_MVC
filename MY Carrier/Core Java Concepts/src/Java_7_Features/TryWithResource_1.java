package Java_7_Features;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//without try with resources
		BufferedReader br=null;
		try
		{
			 br=new BufferedReader(new FileReader("new folder/scan.csv"));
			System.out.println(br.readLine());
		}
		catch(Exception e){			e.printStackTrace();	}
		finally
		{
			try
			{
			if(br!=null)
			{
				br.close();
			}
			}	catch(Exception e)	{	e.printStackTrace();	}
		}
		
		//try with resources
		try(BufferedReader buf=new BufferedReader(new FileReader("new folder/files.txt")))
		{
			System.out.println(buf.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
