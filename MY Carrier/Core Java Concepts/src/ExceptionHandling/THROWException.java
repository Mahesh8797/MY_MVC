package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class THROWException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub				
		print(20,30);
		pointer(null);
		 try
		 {
		File wr=new File("hiiii.txt");
		BufferedReader br=new BufferedReader(new FileReader(wr));
		br.readLine();
		 }
		 catch(FileNotFoundException e)
		 {
			System.out.println(e);
			e.printStackTrace();
		 }

	}
	
	private static void pointer(String data) {		
		if(data==null)
		{
			throw new NullPointerException("The value is null");
		}
		else
		{
			System.out.println("Printing the vlaue");
		}
		
	}
	private static void print(int data, int d1)
	{
		
		if(data>10 && d1<40)
		{
		throw new ArithmeticException("Divide by 0");	
		}
	}
	}

