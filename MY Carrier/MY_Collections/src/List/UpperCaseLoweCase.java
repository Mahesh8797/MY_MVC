package List;

import java.util.Scanner;

public class UpperCaseLoweCase {

	public static void main(String[] args) {
		
		String str="FGFfgfvFH3454@#";
	//	char c[]=str.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String ch=sc.next();
		char c[]=ch.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]>='A' &&c[i]<='Z')
			{
				
				System.out.println("The upper case character "+ c[i]);
			}
			else if(c[i]>='a'&& c[i]<='z')
			{
				System.out.println("The lower case character "+ c[i]);
			}
			else if(c[i]>='0'&& c[i]<='9')
			{
				System.out.println("The number "+ " Count "+c[i]);
			}
			else
			{
				System.out.println("The special character");
			}
			
		}
		
		

	}

}
