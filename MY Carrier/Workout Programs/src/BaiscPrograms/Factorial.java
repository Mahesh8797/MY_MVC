package BaiscPrograms;

import java.util.Scanner;

public class Factorial {

	static int fact(int n)
	{
		int output;	
		if(n==1)
		{
			return 1;
		}
		else
		{
		output=fact(n-1) *n;
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		int fact=fact(num);
		System.out.println(fact);
		
	}

}
