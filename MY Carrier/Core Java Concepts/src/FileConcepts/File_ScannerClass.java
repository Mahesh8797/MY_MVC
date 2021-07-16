package FileConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File_ScannerClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("mahe.csv");
		Scanner scanner=new Scanner(file);
		scanner.useDelimiter(System.getProperty("line.separator"));
		while(scanner.hasNext())
		{
			Friends fr= parseCSVLine(scanner.next());
			System.out.println(fr);
		}
        scanner.close();
        
        System.out.println("enter Input");
        Scanner sc=new Scanner(System.in);
        System.out.println("First name is "+sc.nextLine());
        
	}
	public static Friends parseCSVLine(String line) 
	{
		
		Scanner sc=new Scanner(line);
		sc.useDelimiter("\\s*,\\s*");
		String name=sc.next();
		int age =sc.nextInt();
		String gender=sc.next();		
		return new Friends(name,age,gender);					
	}
		
	
}
class Friends
{
	String name;
	int age;
	String gender;
	public Friends(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString()
	{
		return "Name : "+name+" Age : "+age+ " Gender : "+gender;
	}
	
}
