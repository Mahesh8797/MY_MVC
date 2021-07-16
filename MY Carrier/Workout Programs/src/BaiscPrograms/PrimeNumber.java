package BaiscPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number to check if prime or not");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		if(n==0||n==1)
		{
			System.out.println("n is neither prime nor composite");
		}
		if(n==2)
		{
			System.out.println("n is  prime number");
		}
		for(int j=2;j<n/2;j++)
		{
			if(n%j==0)
			{
				System.out.println(n+ " not a prime");
				return;
			}
			
		}
		System.out.println(n+ " is a prime");
		
		}
	}
	


