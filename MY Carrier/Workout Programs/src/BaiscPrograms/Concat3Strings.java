package BaiscPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Concat3Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1 ");
		String s1=sc.next();
		System.out.println("Enter string 2 ");
		String s2=sc.next();
		System.out.println("Enter string 3 ");
		String s3=sc.next();
		
		String s4=s1.concat(s2.concat(s3));
		System.out.println("Concatenated string "+s4);
		
		int n=5;
		String input[]=new String[n];
		System.out.println("Enter strings");
		for(int i=0;i<n;i++)
		{
			Scanner scan=new Scanner(System.in);
			input[i]=scan.next();
			
		}
		System.out.println(Arrays.toString(input));
		StringBuilder sb=new StringBuilder();
		for(String s: input)
		{
			sb.append(s);
		}
		System.out.println(sb);
	}

}
