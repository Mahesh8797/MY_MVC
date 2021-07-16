package List;

import java.util.Scanner;

public class CSVFile {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}

}
