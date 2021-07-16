package DataTypes_Operators;

import java.util.ArrayList;

public class AutoboxingandUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		Integer b=20;
		Integer c= Integer.valueOf(a);
		Integer d=new Integer(30);		
		int abc=a+b;		
		System.out.println(abc);		
	ArrayList<Integer>list=new ArrayList<Integer>();	
	for(int i=0;i<5;i++)	
		list.add(i);
	System.out.println(list);
	
	ArrayList<Integer>li=new ArrayList<Integer>();	
	for(int i=0;i<5;i++)
		li.add(i);
	int last=0;
	for(Integer i: li)
	if(i<5)
	{
		last=last+i;
		i++; //i.intValueof(i)	
	System.out.println(last);
	}
	}

}
