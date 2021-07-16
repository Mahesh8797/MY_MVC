package BaiscPrograms;

import java.util.Scanner;

public class SwappingTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int First=sc.nextInt();
		System.out.println("Enter second num");
		int Second=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("First "+First);
		System.out.println("Second "+Second);
		
		First=First+Second;
		Second=First-Second;
		First=First-Second;
		
		System.out.println("After swapping");
		System.out.println("First "+First);
		System.out.println("Second "+Second);
		
	}

}
